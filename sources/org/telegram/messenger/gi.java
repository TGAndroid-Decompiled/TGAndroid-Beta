package org.telegram.messenger;

import android.content.Context;
public final class gi implements Runnable {
    public final int f17321a;
    public final SecretChatHelper f17322b;
    public final Context f17323c;
    public final org.telegram.ui.ActionBar.d2 d;

    public gi(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f17321a = i10;
        this.f17322b = secretChatHelper;
        this.f17323c = context;
        this.d = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f17321a) {
            case 0:
                this.f17322b.lambda$startSecretChat$27(this.f17323c, this.d);
                return;
            default:
                this.f17322b.lambda$startSecretChat$29(this.f17323c, this.d);
                return;
        }
    }
}
