package org.telegram.messenger;

import android.content.Context;
public final class ci implements Runnable {
    public final int f19963a;
    public final SecretChatHelper f19964b;
    public final Context f19965c;
    public final org.telegram.ui.ActionBar.c2 d;

    public ci(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f19963a = i10;
        this.f19964b = secretChatHelper;
        this.f19965c = context;
        this.d = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f19963a) {
            case 0:
                this.f19964b.lambda$startSecretChat$27(this.f19965c, this.d);
                return;
            default:
                this.f19964b.lambda$startSecretChat$29(this.f19965c, this.d);
                return;
        }
    }
}
