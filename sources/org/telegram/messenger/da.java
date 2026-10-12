package org.telegram.messenger;

import android.content.Context;
public final class da implements Runnable {
    public final int f17065a;
    public final Context f17066b;
    public final org.telegram.ui.ActionBar.a2 f17067c;

    public da(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f17065a = i10;
        this.f17066b = context;
        this.f17067c = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f17065a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f17066b, this.f17067c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f17066b, this.f17067c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17066b, this.f17067c);
                return;
        }
    }
}
