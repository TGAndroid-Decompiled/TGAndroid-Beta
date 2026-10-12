package org.telegram.messenger;

import android.content.Context;
public final class ii implements Runnable {
    public final int f17887a;
    public final SecretChatHelper f17888b;
    public final Context f17889c;
    public final org.telegram.ui.ActionBar.a2 d;

    public ii(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f17887a = i10;
        this.f17888b = secretChatHelper;
        this.f17889c = context;
        this.d = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f17887a) {
            case 0:
                this.f17888b.lambda$startSecretChat$27(this.f17889c, this.d);
                return;
            default:
                this.f17888b.lambda$startSecretChat$29(this.f17889c, this.d);
                return;
        }
    }
}
