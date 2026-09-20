package org.telegram.messenger;

import android.content.Context;
public final class ei implements Runnable {
    public final int f16279a;
    public final SecretChatHelper f16280b;
    public final Context f16281c;
    public final org.telegram.ui.ActionBar.b2 d;

    public ei(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f16279a = i10;
        this.f16280b = secretChatHelper;
        this.f16281c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f16279a) {
            case 0:
                this.f16280b.lambda$startSecretChat$27(this.f16281c, this.d);
                return;
            default:
                this.f16280b.lambda$startSecretChat$29(this.f16281c, this.d);
                return;
        }
    }
}
