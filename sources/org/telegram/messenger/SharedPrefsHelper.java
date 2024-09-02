package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefsHelper {
    private static String WEB_VIEW_SHOWN_DIALOG_FORMAT = "confirm_shown_%d_%d";
    private static SharedPreferences webViewBotsPrefs;

    public static void init(Context context) {
        webViewBotsPrefs = context.getSharedPreferences("webview_bots", 0);
    }

    public static boolean isWebViewConfirmShown(int i, long j) {
        return webViewBotsPrefs.getBoolean(String.format(WEB_VIEW_SHOWN_DIALOG_FORMAT, Integer.valueOf(i), Long.valueOf(j)), false);
    }

    public static void setWebViewConfirmShown(int i, long j, boolean z) {
        webViewBotsPrefs.edit().putBoolean(String.format(WEB_VIEW_SHOWN_DIALOG_FORMAT, Integer.valueOf(i), Long.valueOf(j)), z).apply();
    }

    public static void cleanupAccount(int i) {
        SharedPreferences sharedPreferences = webViewBotsPrefs;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : webViewBotsPrefs.getAll().keySet()) {
                if (str.startsWith("confirm_shown_" + i + "_")) {
                    edit.remove(str);
                }
            }
            edit.apply();
        }
    }

    public static SharedPreferences getWebViewBotsPrefs() {
        return webViewBotsPrefs;
    }
}
