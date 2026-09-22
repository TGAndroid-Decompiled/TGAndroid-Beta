package org.telegram.messenger;

import android.content.Context;
public final class ei implements Runnable {
    public final int f16048a;
    public final SecretChatHelper f16049b;
    public final Context f16050c;
    public final org.telegram.ui.ActionBar.b2 d;

    public ei(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f16048a = i10;
        this.f16049b = secretChatHelper;
        this.f16050c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f16048a) {
            case 0:
                this.f16049b.lambda$startSecretChat$27(this.f16050c, this.d);
                return;
            default:
                this.f16049b.lambda$startSecretChat$29(this.f16050c, this.d);
                return;
        }
    }
}
