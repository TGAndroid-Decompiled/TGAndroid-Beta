package org.telegram.messenger;

import android.content.Context;
public final class da implements Runnable {
    public final int f16762a;
    public final Context f16763b;
    public final org.telegram.ui.ActionBar.a2 f16764c;

    public da(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f16762a = i10;
        this.f16763b = context;
        this.f16764c = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f16762a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f16763b, this.f16764c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f16763b, this.f16764c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f16763b, this.f16764c);
                return;
        }
    }
}
