package org.telegram.messenger.pip.utils;

import android.content.Intent;

public abstract class PipActions {
    public static int getActionId(Intent intent) {
        return intent.getIntExtra("action_id", -1);
    }

    public static String getSourceId(Intent intent) {
        return intent.getStringExtra("source_id");
    }

    public static boolean isPipIntent(Intent intent) {
        return "PIP_CUSTOM_EVENT".equals(intent.getAction());
    }
}
