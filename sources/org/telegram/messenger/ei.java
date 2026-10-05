package org.telegram.messenger;

import android.content.Context;
public final class ei implements Runnable {
    public final int f17783a;
    public final SecretChatHelper f17784b;
    public final Context f17785c;
    public final org.telegram.ui.ActionBar.b2 d;

    public ei(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17783a = i10;
        this.f17784b = secretChatHelper;
        this.f17785c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17783a) {
            case 0:
                this.f17784b.lambda$startSecretChat$27(this.f17785c, this.d);
                return;
            default:
                this.f17784b.lambda$startSecretChat$29(this.f17785c, this.d);
                return;
        }
    }
}
