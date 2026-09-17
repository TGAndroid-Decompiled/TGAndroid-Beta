package org.telegram.messenger;

import android.content.Context;
public final class di implements Runnable {
    public final int f17519a;
    public final SecretChatHelper f17520b;
    public final Context f17521c;
    public final org.telegram.ui.ActionBar.b2 d;

    public di(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17519a = i10;
        this.f17520b = secretChatHelper;
        this.f17521c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17519a) {
            case 0:
                this.f17520b.lambda$startSecretChat$27(this.f17521c, this.d);
                return;
            default:
                this.f17520b.lambda$startSecretChat$29(this.f17521c, this.d);
                return;
        }
    }
}
