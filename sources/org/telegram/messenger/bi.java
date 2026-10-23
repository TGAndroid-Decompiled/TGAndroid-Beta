package org.telegram.messenger;

import android.content.Context;
public final class bi implements Runnable {
    public final int f18041a;
    public final SecretChatHelper f18042b;
    public final Context f18043c;
    public final org.telegram.ui.ActionBar.c2 d;

    public bi(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f18041a = i10;
        this.f18042b = secretChatHelper;
        this.f18043c = context;
        this.d = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f18041a) {
            case 0:
                this.f18042b.lambda$startSecretChat$27(this.f18043c, this.d);
                return;
            default:
                this.f18042b.lambda$startSecretChat$29(this.f18043c, this.d);
                return;
        }
    }
}
