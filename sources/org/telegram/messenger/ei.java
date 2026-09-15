package org.telegram.messenger;

import android.content.Context;
public final class ei implements Runnable {
    public final int f16051a;
    public final SecretChatHelper f16052b;
    public final Context f16053c;
    public final org.telegram.ui.ActionBar.b2 d;

    public ei(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f16051a = i10;
        this.f16052b = secretChatHelper;
        this.f16053c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f16051a) {
            case 0:
                this.f16052b.lambda$startSecretChat$27(this.f16053c, this.d);
                return;
            default:
                this.f16052b.lambda$startSecretChat$29(this.f16053c, this.d);
                return;
        }
    }
}
