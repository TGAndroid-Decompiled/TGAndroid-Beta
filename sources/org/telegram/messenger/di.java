package org.telegram.messenger;

import android.content.Context;
public final class di implements Runnable {
    public final int f17669a;
    public final SecretChatHelper f17670b;
    public final Context f17671c;
    public final org.telegram.ui.ActionBar.a2 d;

    public di(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f17669a = i10;
        this.f17670b = secretChatHelper;
        this.f17671c = context;
        this.d = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f17669a) {
            case 0:
                this.f17670b.lambda$startSecretChat$27(this.f17671c, this.d);
                return;
            default:
                this.f17670b.lambda$startSecretChat$29(this.f17671c, this.d);
                return;
        }
    }
}
