package org.telegram.messenger;

import android.content.Context;
public final class di implements Runnable {
    public final int f16211a;
    public final SecretChatHelper f16212b;
    public final Context f16213c;
    public final org.telegram.ui.ActionBar.c2 d;

    public di(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f16211a = i10;
        this.f16212b = secretChatHelper;
        this.f16213c = context;
        this.d = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f16211a) {
            case 0:
                this.f16212b.lambda$startSecretChat$27(this.f16213c, this.d);
                return;
            default:
                this.f16212b.lambda$startSecretChat$29(this.f16213c, this.d);
                return;
        }
    }
}
