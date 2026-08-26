package org.telegram.messenger;

import android.content.SharedPreferences;

public abstract class MessagesController$$ExternalSyntheticOutline0 {
    public static SharedPreferences.Editor m(SharedPreferences.Editor editor, String str, String str2, String str3, String str4) {
        return editor.remove(str).remove(str2).remove(str3).remove(str4);
    }
}
