package org.telegram.messenger;

import android.content.Context;
public final class ei implements Runnable {
    public final int f17566a;
    public final SecretChatHelper f17567b;
    public final Context f17568c;
    public final org.telegram.ui.ActionBar.b2 d;

    public ei(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17566a = i10;
        this.f17567b = secretChatHelper;
        this.f17568c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17566a) {
            case 0:
                this.f17567b.lambda$startSecretChat$27(this.f17568c, this.d);
                return;
            default:
                this.f17567b.lambda$startSecretChat$29(this.f17568c, this.d);
                return;
        }
    }
}
