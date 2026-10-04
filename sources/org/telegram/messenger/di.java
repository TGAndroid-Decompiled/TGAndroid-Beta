package org.telegram.messenger;

import android.content.Context;
public final class di implements Runnable {
    public final int f17686a;
    public final SecretChatHelper f17687b;
    public final Context f17688c;
    public final org.telegram.ui.ActionBar.b2 d;

    public di(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17686a = i10;
        this.f17687b = secretChatHelper;
        this.f17688c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17686a) {
            case 0:
                this.f17687b.lambda$startSecretChat$27(this.f17688c, this.d);
                return;
            default:
                this.f17687b.lambda$startSecretChat$29(this.f17688c, this.d);
                return;
        }
    }
}
