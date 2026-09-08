package org.telegram.messenger;

import android.content.Context;
public final class ei implements Runnable {
    public final int f17593a;
    public final SecretChatHelper f17594b;
    public final Context f17595c;
    public final org.telegram.ui.ActionBar.b2 d;

    public ei(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17593a = i10;
        this.f17594b = secretChatHelper;
        this.f17595c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17593a) {
            case 0:
                this.f17594b.lambda$startSecretChat$27(this.f17595c, this.d);
                return;
            default:
                this.f17594b.lambda$startSecretChat$29(this.f17595c, this.d);
                return;
        }
    }
}
