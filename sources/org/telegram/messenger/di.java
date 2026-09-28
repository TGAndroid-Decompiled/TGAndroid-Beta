package org.telegram.messenger;

import android.content.Context;
public final class di implements Runnable {
    public final int f16224a;
    public final SecretChatHelper f16225b;
    public final Context f16226c;
    public final org.telegram.ui.ActionBar.a2 d;

    public di(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f16224a = i10;
        this.f16225b = secretChatHelper;
        this.f16226c = context;
        this.d = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f16224a) {
            case 0:
                this.f16225b.lambda$startSecretChat$27(this.f16226c, this.d);
                return;
            default:
                this.f16225b.lambda$startSecretChat$29(this.f16226c, this.d);
                return;
        }
    }
}
