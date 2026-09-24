package org.telegram.messenger;

import android.content.Context;
public final class di implements Runnable {
    public final int f16202a;
    public final SecretChatHelper f16203b;
    public final Context f16204c;
    public final org.telegram.ui.ActionBar.a2 d;

    public di(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f16202a = i10;
        this.f16203b = secretChatHelper;
        this.f16204c = context;
        this.d = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f16202a) {
            case 0:
                this.f16203b.lambda$startSecretChat$27(this.f16204c, this.d);
                return;
            default:
                this.f16203b.lambda$startSecretChat$29(this.f16204c, this.d);
                return;
        }
    }
}
