package org.telegram.messenger;

import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$JSONValue;
import org.telegram.tgnet.TLRPC$TL_jsonArray;
import org.telegram.tgnet.TLRPC$TL_jsonNumber;
import org.telegram.tgnet.TLRPC$TL_jsonObject;
import org.telegram.tgnet.TLRPC$TL_jsonObjectValue;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
public class LiteMode {
    private static int BATTERY_HIGH = 10;
    private static int BATTERY_LOW = 10;
    private static int BATTERY_MEDIUM = 10;
    public static final int FLAGS_ANIMATED_EMOJI = 28700;
    public static final int FLAGS_ANIMATED_STICKERS = 3;
    public static final int FLAGS_CHAT = 98784;
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
    public static int PRESET_HIGH = 131071;
    public static int PRESET_LOW = 67612;
    public static int PRESET_MEDIUM = 73311;
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
        if (!z && Build.VERSION.SDK_INT >= 21) {
            int batteryLevel = getBatteryLevel();
            int i = powerSaverLevel;
            if (batteryLevel <= i && i > 0) {
                if (!lastPowerSaverApplied) {
                    lastPowerSaverApplied = true;
                    onPowerSaverApplied(true);
                }
                return PRESET_POWER_SAVER;
            } else if (lastPowerSaverApplied) {
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
            value2 = (i ^ (-1)) & getValue(true);
        }
        setAllFlags(value2);
    }

    public static void setAllFlags(int i) {
        value = i;
        savePreference();
    }

    public static void updatePresets(TLRPC$TL_jsonObject tLRPC$TL_jsonObject) {
        for (int i = 0; i < tLRPC$TL_jsonObject.value.size(); i++) {
            TLRPC$TL_jsonObjectValue tLRPC$TL_jsonObjectValue = tLRPC$TL_jsonObject.value.get(i);
            if ("settings_mask".equals(tLRPC$TL_jsonObjectValue.key)) {
                TLRPC$JSONValue tLRPC$JSONValue = tLRPC$TL_jsonObjectValue.value;
                if (tLRPC$JSONValue instanceof TLRPC$TL_jsonArray) {
                    ArrayList<TLRPC$JSONValue> arrayList = ((TLRPC$TL_jsonArray) tLRPC$JSONValue).value;
                    try {
                        PRESET_LOW = (int) ((TLRPC$TL_jsonNumber) arrayList.get(0)).value;
                        PRESET_MEDIUM = (int) ((TLRPC$TL_jsonNumber) arrayList.get(1)).value;
                        PRESET_HIGH = (int) ((TLRPC$TL_jsonNumber) arrayList.get(2)).value;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
            if ("battery_low".equals(tLRPC$TL_jsonObjectValue.key)) {
                TLRPC$JSONValue tLRPC$JSONValue2 = tLRPC$TL_jsonObjectValue.value;
                if (tLRPC$JSONValue2 instanceof TLRPC$TL_jsonArray) {
                    ArrayList<TLRPC$JSONValue> arrayList2 = ((TLRPC$TL_jsonArray) tLRPC$JSONValue2).value;
                    try {
                        BATTERY_LOW = (int) ((TLRPC$TL_jsonNumber) arrayList2.get(0)).value;
                        BATTERY_MEDIUM = (int) ((TLRPC$TL_jsonNumber) arrayList2.get(1)).value;
                        BATTERY_HIGH = (int) ((TLRPC$TL_jsonNumber) arrayList2.get(2)).value;
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
        if (!globalMainSettings.contains("lite_mode3")) {
            if (globalMainSettings.contains("lite_mode2")) {
                i = globalMainSettings.getInt("lite_mode2", i) | 65536;
                globalMainSettings.edit().putInt("lite_mode3", i).apply();
            } else if (globalMainSettings.contains("lite_mode")) {
                i = globalMainSettings.getInt("lite_mode", i);
                if (i == 4095) {
                    i = PRESET_HIGH;
                }
            } else {
                boolean z = false;
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
                    i = (globalMainSettings.getBoolean("autoplay_video", true) || globalMainSettings.getBoolean("autoplay_video_liteforce", false)) ? true : true ? i | 1024 : i & (-1025);
                }
                if (globalMainSettings.contains("autoplay_gif")) {
                    i = globalMainSettings.getBoolean("autoplay_gif", true) ? i | 2048 : i & (-2049);
                }
                if (globalMainSettings.contains("chatBlur")) {
                    i = globalMainSettings.getBoolean("chatBlur", true) ? i | 256 : i & (-257);
                }
            }
        }
        int i3 = value;
        int i4 = globalMainSettings.getInt("lite_mode3", i);
        value = i4;
        if (loaded) {
            onFlagsUpdate(i3, i4);
        }
        powerSaverLevel = globalMainSettings.getInt("lite_mode_battery_level", i2);
        loaded = true;
    }

    public static void savePreference() {
        MessagesController.getGlobalMainSettings().edit().putInt("lite_mode3", value).putInt("lite_mode_battery_level", powerSaverLevel).apply();
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
        int i3 = (i ^ (-1)) & i2;
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
}
