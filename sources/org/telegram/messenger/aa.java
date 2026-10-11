package org.telegram.messenger;

import android.content.Context;
public final class aa implements Runnable {
    public final int f17352a;
    public final Context f17353b;
    public final org.telegram.ui.ActionBar.a2 f17354c;

    public aa(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f17352a = i10;
        this.f17353b = context;
        this.f17354c = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f17352a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f17353b, this.f17354c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f17353b, this.f17354c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17353b, this.f17354c);
                return;
        }
    }
}
