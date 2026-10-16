package org.telegram.messenger;

import android.content.Context;
public final class fi implements Runnable {
    public final int f16956a;
    public final SecretChatHelper f16957b;
    public final Context f16958c;
    public final org.telegram.ui.ActionBar.a2 d;

    public fi(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f16956a = i10;
        this.f16957b = secretChatHelper;
        this.f16958c = context;
        this.d = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f16956a) {
            case 0:
                this.f16957b.lambda$startSecretChat$27(this.f16958c, this.d);
                return;
            default:
                this.f16957b.lambda$startSecretChat$29(this.f16958c, this.d);
                return;
        }
    }
}
