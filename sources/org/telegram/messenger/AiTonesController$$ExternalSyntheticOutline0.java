package org.telegram.messenger;

import android.content.SharedPreferences;

public abstract class AiTonesController$$ExternalSyntheticOutline0 {
    public static SharedPreferences.Editor m(int i) {
        return MessagesController.getInstance(i).getMainSettings().edit();
    }
}
