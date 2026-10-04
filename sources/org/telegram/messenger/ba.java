package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f17415a;
    public final Context f17416b;
    public final org.telegram.ui.ActionBar.b2 f17417c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f17415a = i10;
        this.f17416b = context;
        this.f17417c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17415a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f17416b, this.f17417c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f17416b, this.f17417c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17416b, this.f17417c);
                return;
        }
    }
}
