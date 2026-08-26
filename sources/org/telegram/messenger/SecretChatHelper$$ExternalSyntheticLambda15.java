package org.telegram.messenger;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog;

public final class SecretChatHelper$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final SecretChatHelper f$0;
    public final Context f$1;
    public final AlertDialog f$2;

    public SecretChatHelper$$ExternalSyntheticLambda15(SecretChatHelper secretChatHelper, Context context, AlertDialog alertDialog, int i) {
        this.$r8$classId = i;
        this.f$0 = secretChatHelper;
        this.f$1 = context;
        this.f$2 = alertDialog;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startSecretChat$27(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$startSecretChat$29(this.f$1, this.f$2);
                break;
        }
    }
}
