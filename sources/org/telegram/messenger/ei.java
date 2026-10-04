package org.telegram.messenger;

import android.content.Context;
public final class ei implements Runnable {
    public final int f17778a;
    public final SecretChatHelper f17779b;
    public final Context f17780c;
    public final org.telegram.ui.ActionBar.b2 d;

    public ei(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17778a = i10;
        this.f17779b = secretChatHelper;
        this.f17780c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17778a) {
            case 0:
                this.f17779b.lambda$startSecretChat$27(this.f17780c, this.d);
                return;
            default:
                this.f17779b.lambda$startSecretChat$29(this.f17780c, this.d);
                return;
        }
    }
}
