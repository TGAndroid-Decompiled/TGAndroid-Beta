package org.telegram.messenger;

import android.content.Context;
public final class vh implements Runnable {
    public final int f21775a;
    public final SecretChatHelper f21776b;
    public final Context f21777c;
    public final org.telegram.ui.ActionBar.c2 d;

    public vh(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        this.f21775a = i9;
        this.f21776b = secretChatHelper;
        this.f21777c = context;
        this.d = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f21775a) {
            case 0:
                this.f21776b.lambda$startSecretChat$27(this.f21777c, this.d);
                return;
            default:
                this.f21776b.lambda$startSecretChat$29(this.f21777c, this.d);
                return;
        }
    }
}
