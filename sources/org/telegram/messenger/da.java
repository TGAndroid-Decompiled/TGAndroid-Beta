package org.telegram.messenger;

import android.content.Context;
public final class da implements Runnable {
    public final int f18247a;
    public final Context f18248b;
    public final org.telegram.ui.ActionBar.c2 f18249c;

    public da(int i10, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f18247a = i10;
        this.f18248b = context;
        this.f18249c = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f18247a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f18248b, this.f18249c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f18248b, this.f18249c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f18248b, this.f18249c);
                return;
        }
    }
}
