package org.telegram.messenger;

import android.content.Context;
public final class ea implements Runnable {
    public final int f20110a;
    public final Context f20111b;
    public final org.telegram.ui.ActionBar.c2 f20112c;

    public ea(int i10, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f20110a = i10;
        this.f20111b = context;
        this.f20112c = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f20110a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f20111b, this.f20112c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f20111b, this.f20112c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f20111b, this.f20112c);
                return;
        }
    }
}
