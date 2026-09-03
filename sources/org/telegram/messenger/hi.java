package org.telegram.messenger;

import android.content.Context;
public final class hi implements Runnable {
    public final int f17394a;
    public final SecretChatHelper f17395b;
    public final Context f17396c;
    public final org.telegram.ui.ActionBar.d2 d;

    public hi(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f17394a = i10;
        this.f17395b = secretChatHelper;
        this.f17396c = context;
        this.d = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f17394a) {
            case 0:
                this.f17395b.lambda$startSecretChat$27(this.f17396c, this.d);
                return;
            default:
                this.f17395b.lambda$startSecretChat$29(this.f17396c, this.d);
                return;
        }
    }
}
