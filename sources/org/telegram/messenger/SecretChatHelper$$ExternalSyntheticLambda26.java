package org.telegram.messenger;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog;

public final class SecretChatHelper$$ExternalSyntheticLambda26 implements Runnable {
    public final int $r8$classId;
    public final Context f$0;
    public final AlertDialog f$1;

    public SecretChatHelper$$ExternalSyntheticLambda26(int i, Context context, AlertDialog alertDialog) {
        this.$r8$classId = i;
        this.f$0 = context;
        this.f$1 = alertDialog;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SecretChatHelper.lambda$startSecretChat$24(this.f$0, this.f$1);
                break;
            case 1:
                MessagesController.lambda$convertToGigaGroup$267(this.f$0, this.f$1);
                break;
            default:
                MessagesController.lambda$convertToMegaGroup$262(this.f$0, this.f$1);
                break;
        }
    }
}
