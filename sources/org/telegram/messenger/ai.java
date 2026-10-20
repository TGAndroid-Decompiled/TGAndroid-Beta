package org.telegram.messenger;

import android.content.Context;
public final class ai implements Runnable {
    public final int f17893a;
    public final SecretChatHelper f17894b;
    public final Context f17895c;
    public final org.telegram.ui.ActionBar.b2 d;

    public ai(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17893a = i10;
        this.f17894b = secretChatHelper;
        this.f17895c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17893a) {
            case 0:
                this.f17894b.lambda$startSecretChat$27(this.f17895c, this.d);
                return;
            default:
                this.f17894b.lambda$startSecretChat$29(this.f17895c, this.d);
                return;
        }
    }
}
