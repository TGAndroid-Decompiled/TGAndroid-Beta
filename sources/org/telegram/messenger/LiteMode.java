package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.BatteryManager;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

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
    public static int PRESET_HIGH = 262143;
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

    public static class BatteryReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            long unused = LiteMode.lastBatteryLevelChecked = 0L;
            LiteMode.getValue();
        }
    }

    public static void addOnPowerSaverAppliedListener(Utilities.Callback<Boolean> callback) {
        if (onPowerSaverAppliedListeners == null) {
            onPowerSaverAppliedListeners = new HashSet<>();
        }
        onPowerSaverAppliedListeners.add(callback);
    }

    public static int getBatteryLevel() {
        long jCurrentTimeMillis;
        if (lastBatteryLevelCached >= 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - lastBatteryLevelChecked > 12000) {
            }
            return lastBatteryLevelCached;
        }
        jCurrentTimeMillis = 0;
        BatteryManager batteryManager = (BatteryManager) ApplicationLoader.applicationContext.getSystemService("batterymanager");
        if (batteryManager != null) {
            lastBatteryLevelCached = batteryManager.getIntProperty(4);
            lastBatteryLevelChecked = jCurrentTimeMillis;
        }
        return lastBatteryLevelCached;
    }

    public static int getPowerSaverLevel() {
        if (!loaded) {
            loadPreference();
        }
        return powerSaverLevel;
    }

    public static int getValue() {
        return getValue(false);
    }

    public static boolean isEnabled(int i10) {
        if (i10 == 64 && AndroidUtilities.isTablet()) {
            return true;
        }
        return (preprocessFlag(i10) & getValue()) > 0;
    }

    public static boolean isEnabledSetting(int i10) {
        return (i10 & getValue(true)) > 0;
    }

    public static boolean isPowerSaverApplied() {
        getValue(false);
        return lastPowerSaverApplied;
    }

    public static void lambda$onPowerSaverApplied$0(boolean z10) {
        for (Utilities.Callback<Boolean> callback : onPowerSaverAppliedListeners) {
            if (callback != null) {
                callback.run(Boolean.valueOf(z10));
            }
        }
    }

    public static void loadPreference() {
        int i10 = PRESET_HIGH;
        int i11 = BATTERY_HIGH;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            i10 = PRESET_LOW;
            i11 = BATTERY_LOW;
        } else if (SharedConfig.getDevicePerformanceClass() == 1) {
            i10 = PRESET_MEDIUM;
            i11 = BATTERY_MEDIUM;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!globalMainSettings.contains("lite_mode6")) {
            if (globalMainSettings.contains("lite_mode5")) {
                i10 = globalMainSettings.getInt("lite_mode5", i10) & (-262145);
                globalMainSettings.edit().putInt("lite_mode6", i10).apply();
            } else if (globalMainSettings.contains("lite_mode4")) {
                i10 = globalMainSettings.getInt("lite_mode4", i10);
                globalMainSettings.edit().putInt("lite_mode5", i10).apply();
            } else if (globalMainSettings.contains("lite_mode3")) {
                i10 = globalMainSettings.getInt("lite_mode3", i10) | 131072;
                globalMainSettings.edit().putInt("lite_mode5", i10).apply();
            } else if (globalMainSettings.contains("lite_mode2")) {
                i10 = globalMainSettings.getInt("lite_mode2", i10) | 65536;
                globalMainSettings.edit().putInt("lite_mode3", i10).apply();
            } else if (globalMainSettings.contains("lite_mode")) {
                i10 = globalMainSettings.getInt("lite_mode", i10);
                if (i10 == 4095) {
                    i10 = PRESET_HIGH;
                }
            } else {
                if (globalMainSettings.contains("light_mode")) {
                    i10 = (globalMainSettings.getInt("light_mode", SharedConfig.getDevicePerformanceClass() == 0 ? 1 : 0) & 1) > 0 ? PRESET_LOW : PRESET_HIGH;
                }
                if (globalMainSettings.contains("loopStickers")) {
                    i10 = globalMainSettings.getBoolean("loopStickers", true) ? i10 | 2 : i10 & (-3);
                }
                if (globalMainSettings.contains("autoplay_video")) {
                    i10 = (globalMainSettings.getBoolean("autoplay_video", true) || globalMainSettings.getBoolean("autoplay_video_liteforce", false)) ? i10 | 1024 : i10 & (-1025);
                }
                if (globalMainSettings.contains("autoplay_gif")) {
                    i10 = globalMainSettings.getBoolean("autoplay_gif", true) ? i10 | 2048 : i10 & (-2049);
                }
                if (globalMainSettings.contains("chatBlur")) {
                    i10 = globalMainSettings.getBoolean("chatBlur", true) ? i10 | 256 : i10 & (-257);
                }
            }
        }
        int i12 = value;
        int i13 = globalMainSettings.getInt("lite_mode6", i10);
        value = i13;
        if (loaded) {
            onFlagsUpdate(i12, i13);
        }
        powerSaverLevel = globalMainSettings.getInt("lite_mode_battery_level", i11);
        loaded = true;
    }

    private static void onFlagsUpdate(int i10, int i11) {
        int i12 = (~i10) & i11;
        if ((i12 & 28700) > 0) {
            org.telegram.ui.Components.k5.u();
        }
        int i13 = i12 & 32;
        if (i13 > 0) {
            SvgHelper.SvgDrawable.updateLiteValues();
        }
        if (i13 > 0) {
            org.telegram.ui.ActionBar.g6.o1(true);
        }
    }

    private static void onPowerSaverApplied(boolean z10) {
        if (z10) {
            onFlagsUpdate(getValue(true), PRESET_POWER_SAVER);
        } else {
            onFlagsUpdate(PRESET_POWER_SAVER, getValue(true));
        }
        if (onPowerSaverAppliedListeners != null) {
            AndroidUtilities.runOnUIThread(new y3(2, z10));
        }
    }

    private static int preprocessFlag(int i10) {
        if ((i10 & 16388) > 0) {
            i10 = (i10 & (-16389)) | (UserConfig.hasPremiumOnAccounts() ? 4 : 16384);
        }
        if ((i10 & 8200) > 0) {
            i10 = (i10 & (-8201)) | (UserConfig.hasPremiumOnAccounts() ? 8 : 8192);
        }
        if ((i10 & 4112) > 0) {
            return (i10 & (-4113)) | (UserConfig.hasPremiumOnAccounts() ? 16 : 4096);
        }
        return i10;
    }

    public static void removeOnPowerSaverAppliedListener(Utilities.Callback<Boolean> callback) {
        HashSet<Utilities.Callback<Boolean>> hashSet = onPowerSaverAppliedListeners;
        if (hashSet != null) {
            hashSet.remove(callback);
        }
    }

    public static void savePreference() {
        MessagesController.getGlobalMainSettings().edit().putInt("lite_mode6", value).putInt("lite_mode_battery_level", powerSaverLevel).apply();
    }

    public static void setAllFlags(int i10) {
        value = i10;
        savePreference();
    }

    public static void setPowerSaverLevel(int i10) {
        powerSaverLevel = h7.n.b(i10, 0, 100);
        savePreference();
        getValue(false);
    }

    public static void toggleFlag(int i10) {
        toggleFlag(i10, !isEnabled(i10));
    }

    public static void updatePresets(TLRPC.TL_jsonObject tL_jsonObject) {
        TLRPC.JSONValue jSONValue;
        for (int i10 = 0; i10 < tL_jsonObject.value.size(); i10++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i10);
            if ("settings_mask".equals(tL_jsonObjectValue.key)) {
                TLRPC.JSONValue jSONValue2 = tL_jsonObjectValue.value;
                if (jSONValue2 instanceof TLRPC.TL_jsonArray) {
                    ArrayList<TLRPC.JSONValue> arrayList = ((TLRPC.TL_jsonArray) jSONValue2).value;
                    try {
                        PRESET_LOW = (int) ((TLRPC.TL_jsonNumber) arrayList.get(0)).value;
                        PRESET_MEDIUM = (int) ((TLRPC.TL_jsonNumber) arrayList.get(1)).value;
                        PRESET_HIGH = (int) ((TLRPC.TL_jsonNumber) arrayList.get(2)).value;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                } else if ("battery_low".equals(tL_jsonObjectValue.key)) {
                    jSONValue = tL_jsonObjectValue.value;
                    if (jSONValue instanceof TLRPC.TL_jsonArray) {
                        ArrayList<TLRPC.JSONValue> arrayList2 = ((TLRPC.TL_jsonArray) jSONValue).value;
                        try {
                            BATTERY_LOW = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(0)).value;
                            BATTERY_MEDIUM = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(1)).value;
                            BATTERY_HIGH = (int) ((TLRPC.TL_jsonNumber) arrayList2.get(2)).value;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                }
            } else if ("battery_low".equals(tL_jsonObjectValue.key)) {
                jSONValue = tL_jsonObjectValue.value;
                if (jSONValue instanceof TLRPC.TL_jsonArray) {
                    ArrayList<TLRPC.JSONValue> arrayList3 = ((TLRPC.TL_jsonArray) jSONValue).value;
                    BATTERY_LOW = (int) ((TLRPC.TL_jsonNumber) arrayList3.get(0)).value;
                    BATTERY_MEDIUM = (int) ((TLRPC.TL_jsonNumber) arrayList3.get(1)).value;
                    BATTERY_HIGH = (int) ((TLRPC.TL_jsonNumber) arrayList3.get(2)).value;
                }
            }
        }
        loadPreference();
    }

    public static int getValue(boolean z10) {
        if (!loaded) {
            loadPreference();
        }
        if (!z10) {
            int batteryLevel = getBatteryLevel();
            int i10 = powerSaverLevel;
            if (batteryLevel <= i10 && i10 > 0) {
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

    public static void toggleFlag(int i10, boolean z10) {
        int value2;
        if (z10) {
            value2 = i10 | getValue(true);
        } else {
            value2 = (~i10) & getValue(true);
        }
        setAllFlags(value2);
    }
}
