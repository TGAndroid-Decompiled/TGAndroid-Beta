package org.telegram.messenger;

import android.content.Context;
public final class ea implements Runnable {
    public final int f18320a;
    public final Context f18321b;
    public final org.telegram.ui.ActionBar.c2 f18322c;

    public ea(int i10, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f18320a = i10;
        this.f18321b = context;
        this.f18322c = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f18320a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f18321b, this.f18322c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f18321b, this.f18322c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f18321b, this.f18322c);
                return;
        }
    }
}
