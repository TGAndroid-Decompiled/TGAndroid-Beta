package org.telegram.messenger;

import android.content.Context;
public final class da implements Runnable {
    public final int f17394a;
    public final Context f17395b;
    public final org.telegram.ui.ActionBar.a2 f17396c;

    public da(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f17394a = i10;
        this.f17395b = context;
        this.f17396c = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f17394a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f17395b, this.f17396c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f17395b, this.f17396c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17395b, this.f17396c);
                return;
        }
    }
}
