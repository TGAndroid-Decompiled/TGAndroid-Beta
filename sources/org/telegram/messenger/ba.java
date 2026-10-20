package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f17942a;
    public final Context f17943b;
    public final org.telegram.ui.ActionBar.b2 f17944c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f17942a = i10;
        this.f17943b = context;
        this.f17944c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17942a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f17943b, this.f17944c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f17943b, this.f17944c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17943b, this.f17944c);
                return;
        }
    }
}
