package org.telegram.messenger;

import android.content.Context;
public final class di implements Runnable {
    public final int f15956a;
    public final SecretChatHelper f15957b;
    public final Context f15958c;
    public final org.telegram.ui.ActionBar.b2 d;

    public di(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f15956a = i10;
        this.f15957b = secretChatHelper;
        this.f15958c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f15956a) {
            case 0:
                this.f15957b.lambda$startSecretChat$27(this.f15958c, this.d);
                return;
            default:
                this.f15957b.lambda$startSecretChat$29(this.f15958c, this.d);
                return;
        }
    }
}
