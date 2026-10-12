package org.telegram.messenger;

import android.content.Context;
public final class gi implements Runnable {
    public final int f17338a;
    public final SecretChatHelper f17339b;
    public final Context f17340c;
    public final org.telegram.ui.ActionBar.a2 d;

    public gi(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f17338a = i10;
        this.f17339b = secretChatHelper;
        this.f17340c = context;
        this.d = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f17338a) {
            case 0:
                this.f17339b.lambda$startSecretChat$27(this.f17340c, this.d);
                return;
            default:
                this.f17339b.lambda$startSecretChat$29(this.f17340c, this.d);
                return;
        }
    }
}
