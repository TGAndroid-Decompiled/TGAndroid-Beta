package org.telegram.messenger;

import android.content.Context;
public final class bi implements Runnable {
    public final int f17977a;
    public final SecretChatHelper f17978b;
    public final Context f17979c;
    public final org.telegram.ui.ActionBar.b2 d;

    public bi(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17977a = i10;
        this.f17978b = secretChatHelper;
        this.f17979c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17977a) {
            case 0:
                this.f17978b.lambda$startSecretChat$27(this.f17979c, this.d);
                return;
            default:
                this.f17978b.lambda$startSecretChat$29(this.f17979c, this.d);
                return;
        }
    }
}
