package org.telegram.messenger;

import android.content.Context;
public final class ei implements Runnable {
    public final int f20013a;
    public final SecretChatHelper f20014b;
    public final Context f20015c;
    public final org.telegram.ui.ActionBar.e2 d;

    public ei(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.f20013a = i10;
        this.f20014b = secretChatHelper;
        this.f20015c = context;
        this.d = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f20013a) {
            case 0:
                this.f20014b.lambda$startSecretChat$27(this.f20015c, this.d);
                return;
            default:
                this.f20014b.lambda$startSecretChat$29(this.f20015c, this.d);
                return;
        }
    }
}
