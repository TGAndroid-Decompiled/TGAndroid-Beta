package org.telegram.messenger;

import android.content.Context;
public final class fa implements Runnable {
    public final int f17200a;
    public final Context f17201b;
    public final org.telegram.ui.ActionBar.d2 f17202c;

    public fa(int i10, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f17200a = i10;
        this.f17201b = context;
        this.f17202c = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f17200a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f17201b, this.f17202c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f17201b, this.f17202c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17201b, this.f17202c);
                return;
        }
    }
}
