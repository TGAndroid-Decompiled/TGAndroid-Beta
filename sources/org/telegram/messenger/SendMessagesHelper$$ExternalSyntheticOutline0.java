package org.telegram.messenger;

import org.telegram.ui.ActionBar.AlertDialog;

public abstract class SendMessagesHelper$$ExternalSyntheticOutline0 {
    public static void m(String str, int i, Object[] objArr, AlertDialog.Builder builder) {
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(str, i, objArr)));
    }
}
