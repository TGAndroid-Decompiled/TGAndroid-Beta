package org.telegram.messenger;

import android.content.Context;
public final class hi implements Runnable {
    public final int f18880a;
    public final SecretChatHelper f18881b;
    public final Context f18882c;
    public final org.telegram.ui.ActionBar.d2 d;

    public hi(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f18880a = i10;
        this.f18881b = secretChatHelper;
        this.f18882c = context;
        this.d = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f18880a) {
            case 0:
                this.f18881b.lambda$startSecretChat$27(this.f18882c, this.d);
                return;
            default:
                this.f18881b.lambda$startSecretChat$29(this.f18882c, this.d);
                return;
        }
    }
}
