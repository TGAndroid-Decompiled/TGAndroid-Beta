package org.telegram.messenger;

import android.content.Context;
public final class fi implements Runnable {
    public final int f20104a;
    public final SecretChatHelper f20105b;
    public final Context f20106c;
    public final org.telegram.ui.ActionBar.e2 d;

    public fi(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.f20104a = i10;
        this.f20105b = secretChatHelper;
        this.f20106c = context;
        this.d = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f20104a) {
            case 0:
                this.f20105b.lambda$startSecretChat$27(this.f20106c, this.d);
                return;
            default:
                this.f20105b.lambda$startSecretChat$29(this.f20106c, this.d);
                return;
        }
    }
}
