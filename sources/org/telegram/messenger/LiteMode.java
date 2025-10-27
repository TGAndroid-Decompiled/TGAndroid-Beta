package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;

public class LiteMode {
    private static int BATTERY_HIGH = 10;
    private static int BATTERY_LOW = 10;
    private static int BATTERY_MEDIUM = 10;
    public static final int FLAGS_ANIMATED_EMOJI = 28700;
    public static final int FLAGS_ANIMATED_STICKERS = 3;
    public static final int FLAGS_CHAT = 360928;
    public static final int FLAG_ANIMATED_EMOJI_CHAT = 4112;
    public static final int FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM = 4096;
    public static final int FLAG_ANIMATED_EMOJI_CHAT_PREMIUM = 16;
    public static final int FLAG_ANIMATED_EMOJI_KEYBOARD = 16388;
    public static final int FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM = 16384;
    public static final int FLAG_ANIMATED_EMOJI_KEYBOARD_PREMIUM = 4;
    public static final int FLAG_ANIMATED_EMOJI_REACTIONS = 8200;
    public static final int FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM = 8192;
    public static final int FLAG_ANIMATED_EMOJI_REACTIONS_PREMIUM = 8;
    public static final int FLAG_ANIMATED_STICKERS_CHAT = 2;
    public static final int FLAG_ANIMATED_STICKERS_KEYBOARD = 1;
    public static final int FLAG_AUTOPLAY_GIFS = 2048;
    public static final int FLAG_AUTOPLAY_VIDEOS = 1024;
    public static final int FLAG_CALLS_ANIMATIONS = 512;
    public static final int FLAG_CHAT_BACKGROUND = 32;
    public static final int FLAG_CHAT_BLUR = 256;
    public static final int FLAG_CHAT_FORUM_TWOCOLUMN = 64;
    public static final int FLAG_CHAT_SCALE = 32768;
    public static final int FLAG_CHAT_SPOILER = 128;
    public static final int FLAG_CHAT_THANOS = 65536;
    public static final int FLAG_LIQUID_GLASS = 262144;
    public static final int FLAG_PARTICLES = 131072;
    public static int PRESET_HIGH = 524287;
    public static int PRESET_LOW = 198684;
    public static int PRESET_MEDIUM = 204383;
    public static int PRESET_POWER_SAVER = 0;
    private static int lastBatteryLevelCached = -1;
    private static long lastBatteryLevelChecked;
    private static boolean lastPowerSaverApplied;
    private static boolean loaded;
    private static HashSet<Utilities.Callback<Boolean>> onPowerSaverAppliedListeners;
    private static int powerSaverLevel;
    private static int value;

    public static int getValue() {
        return getValue(false);
    }

    public static int getValue(boolean z) {
        if (!loaded) {
            loadPreference();
        }
        if (!z) {
            int batteryLevel = getBatteryLevel();
            int i = powerSaverLevel;
            if (batteryLevel <= i && i > 0) {
                if (!lastPowerSaverApplied) {
                    lastPowerSaverApplied = true;
                    onPowerSaverApplied(true);
                }
                return PRESET_POWER_SAVER;
            }
            if (lastPowerSaverApplied) {
                lastPowerSaverApplied = false;
                onPowerSaverApplied(false);
            }
        }
        return value;
    }

    public static int getBatteryLevel() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.LiteMode.getBatteryLevel():int");
    }

    private static int preprocessFlag(int i) {
        if ((i & 16388) > 0) {
            i = (i & (-16389)) | (UserConfig.hasPremiumOnAccounts() ? 4 : 16384);
        }
        if ((i & 8200) > 0) {
            i = (i & (-8201)) | (UserConfig.hasPremiumOnAccounts() ? 8 : 8192);
        }
        if ((i & 4112) > 0) {
            return (i & (-4113)) | (UserConfig.hasPremiumOnAccounts() ? 16 : 4096);
        }
        return i;
    }

    public static boolean isEnabled(int i) {
        if (i == 64 && AndroidUtilities.isTablet()) {
            return true;
        }
        return (preprocessFlag(i) & getValue()) > 0;
    }

    public static boolean isEnabledSetting(int i) {
        return (i & getValue(true)) > 0;
    }

    public static void toggleFlag(int i) {
        toggleFlag(i, !isEnabled(i));
    }

    public static void toggleFlag(int i, boolean z) {
        int value2;
        if (z) {
            value2 = i | getValue(true);
        } else {
            value2 = (~i) & getValue(true);
        }
        setAllFlags(value2);
    }

    public static void setAllFlags(int i) {
        value = i;
        savePreference();
    }

    public static void updatePresets(TLRPC.TL_jsonObject tL_jsonObject) {
        for (int i = 0; i < tL_jsonObject.value.size(); i++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i);
            if ("settings_mask".equals(tL_jsonObjectValue.key)) {
                TLRPC.JSONValue jSONValue = tL_jsonObjectValue.value;
                if (jSONValue instanceof TLRPC.TL_jsonArray) {
                    ArrayList<TLRPC.JSONValue> arrayList = ((TLRPC.TL_jsonArray) jSONValue).value;
                    try {
                        PRESET_LOW = (int) ((TLRPC.TL_jsonNumber) arrayList.get(0)).value;
                        PRESET_MEDIUM = (int) ((TLRPC.TL_jsonNumber) arrayList.get(1)).value;
                        PRESET_HIGH = (int) ((TLRPC.TL_jsonNumber) arrayList.get(2)).value;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
            if ("battery_low".equals(tL_jsonObjectValue.key)) {
                TLRPC.JSONValue jSONValue2 = tL_jsonObjectValue.value;
                if (jSONValue2 instanceof TLRPC.TL_jsonArray) {
                    ArrayList<TLRPC.JSONValue> arrayList2 = ((TLRPC.TL_jsonArray) jSONValue2).value;
                    try {
                        BATTERY_LOW = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(0)).value;
                        BATTERY_MEDIUM = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(1)).value;
                        BATTERY_HIGH = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(2)).value;
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                }
            }
        }
        loadPreference();
    }

    public static void loadPreference() {
        int i = PRESET_HIGH;
        int i2 = BATTERY_HIGH;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i = PRESET_LOW;
            i2 = BATTERY_LOW;
        } else if (SharedConfig.getDevicePerformanceClass() == 1) {
            i = PRESET_MEDIUM;
            i2 = BATTERY_MEDIUM;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!globalMainSettings.contains("lite_mode5")) {
            if (globalMainSettings.contains("lite_mode4")) {
                i = globalMainSettings.getInt("lite_mode4", i);
                if (BuildVars.DEBUG_VERSION && SharedConfig.getDevicePerformanceClass() == 2) {
                    i |= 262144;
                }
                globalMainSettings.edit().putInt("lite_mode5", i).apply();
            } else if (globalMainSettings.contains("lite_mode3")) {
                int i3 = globalMainSettings.getInt("lite_mode3", i);
                i = SharedConfig.getDevicePerformanceClass() == 2 ? i3 | 393216 : 131072 | i3;
                globalMainSettings.edit().putInt("lite_mode5", i).apply();
            } else if (globalMainSettings.contains("lite_mode2")) {
                i = globalMainSettings.getInt("lite_mode2", i) | 65536;
                globalMainSettings.edit().putInt("lite_mode3", i).apply();
            } else if (globalMainSettings.contains("lite_mode")) {
                i = globalMainSettings.getInt("lite_mode", i);
                if (i == 4095) {
                    i = PRESET_HIGH;
                }
            } else {
                if (globalMainSettings.contains("light_mode")) {
                    if ((globalMainSettings.getInt("light_mode", SharedConfig.getDevicePerformanceClass() == 0 ? 1 : 0) & 1) > 0) {
                        i = PRESET_LOW;
                    } else {
                        i = PRESET_HIGH;
                    }
                }
                if (globalMainSettings.contains("loopStickers")) {
                    i = globalMainSettings.getBoolean("loopStickers", true) ? i | 2 : i & (-3);
                }
                if (globalMainSettings.contains("autoplay_video")) {
                    i = (globalMainSettings.getBoolean("autoplay_video", true) || globalMainSettings.getBoolean("autoplay_video_liteforce", false)) ? i | 1024 : i & (-1025);
                }
                if (globalMainSettings.contains("autoplay_gif")) {
                    i = globalMainSettings.getBoolean("autoplay_gif", true) ? i | 2048 : i & (-2049);
                }
                if (globalMainSettings.contains("chatBlur")) {
                    i = globalMainSettings.getBoolean("chatBlur", true) ? i | 256 : i & (-257);
                }
            }
        }
        int i4 = value;
        int i5 = globalMainSettings.getInt("lite_mode5", i);
        value = i5;
        if (loaded) {
            onFlagsUpdate(i4, i5);
        }
        powerSaverLevel = globalMainSettings.getInt("lite_mode_battery_level", i2);
        loaded = true;
    }

    public static void savePreference() {
        MessagesController.getGlobalMainSettings().edit().putInt("lite_mode4", value).putInt("lite_mode_battery_level", powerSaverLevel).apply();
    }

    public static int getPowerSaverLevel() {
        if (!loaded) {
            loadPreference();
        }
        return powerSaverLevel;
    }

    public static void setPowerSaverLevel(int i) {
        powerSaverLevel = MathUtils.clamp(i, 0, 100);
        savePreference();
        getValue(false);
    }

    public static boolean isPowerSaverApplied() {
        getValue(false);
        return lastPowerSaverApplied;
    }

    private static void onPowerSaverApplied(final boolean z) {
        if (z) {
            onFlagsUpdate(getValue(true), PRESET_POWER_SAVER);
        } else {
            onFlagsUpdate(PRESET_POWER_SAVER, getValue(true));
        }
        if (onPowerSaverAppliedListeners != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LiteMode.lambda$onPowerSaverApplied$0(z);
                }
            });
        }
    }

    public static void lambda$onPowerSaverApplied$0(boolean z) {
        Iterator<Utilities.Callback<Boolean>> it = onPowerSaverAppliedListeners.iterator();
        while (it.hasNext()) {
            Utilities.Callback<Boolean> next = it.next();
            if (next != null) {
                next.run(Boolean.valueOf(z));
            }
        }
    }

    private static void onFlagsUpdate(int i, int i2) {
        int i3 = (~i) & i2;
        if ((i3 & 28700) > 0) {
            AnimatedEmojiDrawable.updateAll();
        }
        int i4 = i3 & 32;
        if (i4 > 0) {
            SvgHelper.SvgDrawable.updateLiteValues();
        }
        if (i4 > 0) {
            Theme.reloadWallpaper(true);
        }
    }

    public static void addOnPowerSaverAppliedListener(Utilities.Callback<Boolean> callback) {
        if (onPowerSaverAppliedListeners == null) {
            onPowerSaverAppliedListeners = new HashSet<>();
        }
        onPowerSaverAppliedListeners.add(callback);
    }

    public static void removeOnPowerSaverAppliedListener(Utilities.Callback<Boolean> callback) {
        HashSet<Utilities.Callback<Boolean>> hashSet = onPowerSaverAppliedListeners;
        if (hashSet != null) {
            hashSet.remove(callback);
        }
    }

    public static class BatteryReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            long unused = LiteMode.lastBatteryLevelChecked = 0L;
            LiteMode.getValue();
        }
    }
}
