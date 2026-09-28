package org.telegram.messenger;

import android.content.Context;
public final class di implements Runnable {
    public final int f16225a;
    public final SecretChatHelper f16226b;
    public final Context f16227c;
    public final org.telegram.ui.ActionBar.a2 d;

    public di(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f16225a = i10;
        this.f16226b = secretChatHelper;
        this.f16227c = context;
        this.d = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f16225a) {
            case 0:
                this.f16226b.lambda$startSecretChat$27(this.f16227c, this.d);
                return;
            default:
                this.f16226b.lambda$startSecretChat$29(this.f16227c, this.d);
                return;
        }
    }
}
