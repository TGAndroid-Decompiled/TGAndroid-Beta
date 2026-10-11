package org.telegram.messenger;

import android.content.Context;
public final class di implements Runnable {
    public final int f17705a;
    public final SecretChatHelper f17706b;
    public final Context f17707c;
    public final org.telegram.ui.ActionBar.a2 d;

    public di(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f17705a = i10;
        this.f17706b = secretChatHelper;
        this.f17707c = context;
        this.d = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f17705a) {
            case 0:
                this.f17706b.lambda$startSecretChat$27(this.f17707c, this.d);
                return;
            default:
                this.f17706b.lambda$startSecretChat$29(this.f17707c, this.d);
                return;
        }
    }
}
