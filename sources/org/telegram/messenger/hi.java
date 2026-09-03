package org.telegram.messenger;

import android.content.Context;
public final class hi implements Runnable {
    public final int f18882a;
    public final SecretChatHelper f18883b;
    public final Context f18884c;
    public final org.telegram.ui.ActionBar.d2 d;

    public hi(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f18882a = i10;
        this.f18883b = secretChatHelper;
        this.f18884c = context;
        this.d = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f18882a) {
            case 0:
                this.f18883b.lambda$startSecretChat$27(this.f18884c, this.d);
                return;
            default:
                this.f18883b.lambda$startSecretChat$29(this.f18884c, this.d);
                return;
        }
    }
}
