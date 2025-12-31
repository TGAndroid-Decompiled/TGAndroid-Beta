package org.telegram.messenger.voip;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

public class VoIPServerConfig {
    private static JSONObject config = new JSONObject();

    private static native void nativeSetConfig(String str);

    public static void setConfig(String str) {
        try {
            config = new JSONObject(str);
            nativeSetConfig(str);
        } catch (JSONException e) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Error parsing VoIP config", e);
            }
        }
    }

    public static int getInt(String str, int i) {
        return config.optInt(str, i);
    }

    public static double getDouble(String str, double d) {
        return config.optDouble(str, d);
    }

    public static String getString(String str, String str2) {
        return config.optString(str, str2);
    }

    public static boolean getBoolean(String str, boolean z) {
        return config.optBoolean(str, z);
    }
}
