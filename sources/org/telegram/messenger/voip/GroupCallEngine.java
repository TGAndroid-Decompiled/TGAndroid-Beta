package org.telegram.messenger.voip;

import android.content.SharedPreferences;
import android.text.TextUtils;
public final class GroupCallEngine {
    public static final String DEBUG_OVERRIDE_KEY = "dbg_group_call_engine";
    public static final String NAME_CUSTOM = "custom";
    public static final String NAME_REFERENCE = "reference";

    private GroupCallEngine() {
    }

    public static String getDebugOverride() {
        return uc7.e1().getString("dbg_group_call_engine", "");
    }

    public static String getName(int i) {
        String debugOverride = getDebugOverride();
        if (!TextUtils.isEmpty(debugOverride)) {
            return debugOverride;
        }
        return uc7.s1(i).k4.I.f;
    }

    public static boolean isReference(int i) {
        return !"custom".equals(getName(i));
    }

    public static void setDebugOverride(String str) {
        SharedPreferences.Editor edit = uc7.e1().edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("dbg_group_call_engine");
        } else {
            edit.putString("dbg_group_call_engine", str);
        }
        edit.apply();
    }
}
