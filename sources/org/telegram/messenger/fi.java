package org.telegram.messenger;

import android.content.Context;
public final class fi implements Runnable {
    public final int f16322a;
    public final SecretChatHelper f16323b;
    public final Context f16324c;
    public final org.telegram.ui.ActionBar.b2 d;

    public fi(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f16322a = i10;
        this.f16323b = secretChatHelper;
        this.f16324c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f16322a) {
            case 0:
                this.f16323b.lambda$startSecretChat$27(this.f16324c, this.d);
                return;
            default:
                this.f16323b.lambda$startSecretChat$29(this.f16324c, this.d);
                return;
        }
    }
}
