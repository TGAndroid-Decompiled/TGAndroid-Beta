package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f17255a;
    public final Context f17256b;
    public final org.telegram.ui.ActionBar.b2 f17257c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f17255a = i10;
        this.f17256b = context;
        this.f17257c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17255a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f17256b, this.f17257c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f17256b, this.f17257c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17256b, this.f17257c);
                return;
        }
    }
}
