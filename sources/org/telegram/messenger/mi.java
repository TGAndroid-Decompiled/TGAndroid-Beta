package org.telegram.messenger;

import android.content.Context;
public final class mi implements Runnable {
    public final int f15792a;
    public final SecretChatHelper f15793b;
    public final Context f15794c;
    public final org.telegram.ui.ActionBar.d2 d;

    public mi(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f15792a = i10;
        this.f15793b = secretChatHelper;
        this.f15794c = context;
        this.d = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f15792a) {
            case 0:
                this.f15793b.lambda$startSecretChat$27(this.f15794c, this.d);
                return;
            default:
                this.f15793b.lambda$startSecretChat$29(this.f15794c, this.d);
                return;
        }
    }
}
