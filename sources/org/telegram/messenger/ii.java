package org.telegram.messenger;

import android.content.Context;
public final class ii implements Runnable {
    public final int f17888a;
    public final SecretChatHelper f17889b;
    public final Context f17890c;
    public final org.telegram.ui.ActionBar.a2 d;

    public ii(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f17888a = i10;
        this.f17889b = secretChatHelper;
        this.f17890c = context;
        this.d = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f17888a) {
            case 0:
                this.f17889b.lambda$startSecretChat$27(this.f17890c, this.d);
                return;
            default:
                this.f17889b.lambda$startSecretChat$29(this.f17890c, this.d);
                return;
        }
    }
}
