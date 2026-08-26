package org.telegram.messenger;

import android.content.SharedPreferences;

public abstract class NotificationsController$$ExternalSyntheticOutline0 {
    public static boolean m(String str, long j, SharedPreferences sharedPreferences, boolean z) {
        return sharedPreferences.getBoolean(str + j, z);
    }
}
