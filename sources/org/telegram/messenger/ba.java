package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f17416a;
    public final Context f17417b;
    public final org.telegram.ui.ActionBar.b2 f17418c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f17416a = i10;
        this.f17417b = context;
        this.f17418c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17416a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f17417b, this.f17418c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f17417b, this.f17418c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17417b, this.f17418c);
                return;
        }
    }
}
