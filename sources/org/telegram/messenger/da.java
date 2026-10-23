package org.telegram.messenger;

import android.content.Context;
public final class da implements Runnable {
    public final int f18183a;
    public final Context f18184b;
    public final org.telegram.ui.ActionBar.b2 f18185c;

    public da(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f18183a = i10;
        this.f18184b = context;
        this.f18185c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f18183a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f18184b, this.f18185c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f18184b, this.f18185c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f18184b, this.f18185c);
                return;
        }
    }
}
