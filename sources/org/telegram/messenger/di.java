package org.telegram.messenger;

import android.content.Context;
public final class di implements Runnable {
    public final int f16241a;
    public final SecretChatHelper f16242b;
    public final Context f16243c;
    public final org.telegram.ui.ActionBar.a2 d;

    public di(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f16241a = i10;
        this.f16242b = secretChatHelper;
        this.f16243c = context;
        this.d = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f16241a) {
            case 0:
                this.f16242b.lambda$startSecretChat$27(this.f16243c, this.d);
                return;
            default:
                this.f16242b.lambda$startSecretChat$29(this.f16243c, this.d);
                return;
        }
    }
}
