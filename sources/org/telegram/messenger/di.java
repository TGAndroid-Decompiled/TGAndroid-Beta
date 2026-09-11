package org.telegram.messenger;

import android.content.Context;
public final class di implements Runnable {
    public final int f17492a;
    public final SecretChatHelper f17493b;
    public final Context f17494c;
    public final org.telegram.ui.ActionBar.b2 d;

    public di(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17492a = i10;
        this.f17493b = secretChatHelper;
        this.f17494c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17492a) {
            case 0:
                this.f17493b.lambda$startSecretChat$27(this.f17494c, this.d);
                return;
            default:
                this.f17493b.lambda$startSecretChat$29(this.f17494c, this.d);
                return;
        }
    }
}
