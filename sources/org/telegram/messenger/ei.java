package org.telegram.messenger;

import android.content.Context;
public final class ei implements Runnable {
    public final int f16060a;
    public final SecretChatHelper f16061b;
    public final Context f16062c;
    public final org.telegram.ui.ActionBar.c2 d;

    public ei(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f16060a = i10;
        this.f16061b = secretChatHelper;
        this.f16062c = context;
        this.d = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f16060a) {
            case 0:
                this.f16061b.lambda$startSecretChat$27(this.f16062c, this.d);
                return;
            default:
                this.f16061b.lambda$startSecretChat$29(this.f16062c, this.d);
                return;
        }
    }
}
