package org.telegram.messenger;

import android.content.Context;
public final class ei implements Runnable {
    public final int f17772a;
    public final SecretChatHelper f17773b;
    public final Context f17774c;
    public final org.telegram.ui.ActionBar.b2 d;

    public ei(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f17772a = i10;
        this.f17773b = secretChatHelper;
        this.f17774c = context;
        this.d = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17772a) {
            case 0:
                this.f17773b.lambda$startSecretChat$27(this.f17774c, this.d);
                return;
            default:
                this.f17773b.lambda$startSecretChat$29(this.f17774c, this.d);
                return;
        }
    }
}
