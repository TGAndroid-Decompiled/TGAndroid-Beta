package org.telegram.messenger;

import android.content.Context;
public final class ei implements Runnable {
    public final int f16294a;
    public final SecretChatHelper f16295b;
    public final Context f16296c;
    public final org.telegram.ui.ActionBar.b2 d;

    public ei(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f16294a = i10;
        this.f16295b = secretChatHelper;
        this.f16296c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f16294a) {
            case 0:
                this.f16295b.lambda$startSecretChat$27(this.f16296c, this.d);
                return;
            default:
                this.f16295b.lambda$startSecretChat$29(this.f16296c, this.d);
                return;
        }
    }
}
