package org.telegram.messenger;

import android.content.Context;
public final class ei implements Runnable {
    public final int f17776a;
    public final SecretChatHelper f17777b;
    public final Context f17778c;
    public final org.telegram.ui.ActionBar.b2 d;

    public ei(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17776a = i10;
        this.f17777b = secretChatHelper;
        this.f17778c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17776a) {
            case 0:
                this.f17777b.lambda$startSecretChat$27(this.f17778c, this.d);
                return;
            default:
                this.f17777b.lambda$startSecretChat$29(this.f17778c, this.d);
                return;
        }
    }
}
