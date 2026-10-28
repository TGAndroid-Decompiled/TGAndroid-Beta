package org.telegram.messenger;

import android.content.Context;
public final class fa implements Runnable {
    public final int f20069a;
    public final Context f20070b;
    public final org.telegram.ui.ActionBar.e2 f20071c;

    public fa(int i10, Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f20069a = i10;
        this.f20070b = context;
        this.f20071c = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f20069a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f20070b, this.f20071c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f20070b, this.f20071c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f20070b, this.f20071c);
                return;
        }
    }
}
