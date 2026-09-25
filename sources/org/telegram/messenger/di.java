package org.telegram.messenger;

import android.content.Context;
public final class di implements Runnable {
    public final int f16217a;
    public final SecretChatHelper f16218b;
    public final Context f16219c;
    public final org.telegram.ui.ActionBar.a2 d;

    public di(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f16217a = i10;
        this.f16218b = secretChatHelper;
        this.f16219c = context;
        this.d = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f16217a) {
            case 0:
                this.f16218b.lambda$startSecretChat$27(this.f16219c, this.d);
                return;
            default:
                this.f16218b.lambda$startSecretChat$29(this.f16219c, this.d);
                return;
        }
    }
}
