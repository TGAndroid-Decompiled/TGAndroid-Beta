package org.telegram.messenger;

import android.content.Context;
public final class ci implements Runnable {
    public final int f18162a;
    public final SecretChatHelper f18163b;
    public final Context f18164c;
    public final org.telegram.ui.ActionBar.c2 d;

    public ci(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f18162a = i10;
        this.f18163b = secretChatHelper;
        this.f18164c = context;
        this.d = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f18162a) {
            case 0:
                this.f18163b.lambda$startSecretChat$27(this.f18164c, this.d);
                return;
            default:
                this.f18163b.lambda$startSecretChat$29(this.f18164c, this.d);
                return;
        }
    }
}
