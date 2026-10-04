package org.telegram.messenger;

import android.content.Context;
public final class di implements Runnable {
    public final int f17685a;
    public final SecretChatHelper f17686b;
    public final Context f17687c;
    public final org.telegram.ui.ActionBar.b2 d;

    public di(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17685a = i10;
        this.f17686b = secretChatHelper;
        this.f17687c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17685a) {
            case 0:
                this.f17686b.lambda$startSecretChat$27(this.f17687c, this.d);
                return;
            default:
                this.f17686b.lambda$startSecretChat$29(this.f17687c, this.d);
                return;
        }
    }
}
