package org.telegram.messenger;

import android.content.Context;
public final class ci implements Runnable {
    public final int f18098a;
    public final SecretChatHelper f18099b;
    public final Context f18100c;
    public final org.telegram.ui.ActionBar.b2 d;

    public ci(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f18098a = i10;
        this.f18099b = secretChatHelper;
        this.f18100c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f18098a) {
            case 0:
                this.f18099b.lambda$startSecretChat$27(this.f18100c, this.d);
                return;
            default:
                this.f18099b.lambda$startSecretChat$29(this.f18100c, this.d);
                return;
        }
    }
}
