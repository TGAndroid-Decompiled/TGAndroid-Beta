package org.telegram.messenger;

import android.content.Context;
public final class aa implements Runnable {
    public final int f17321a;
    public final Context f17322b;
    public final org.telegram.ui.ActionBar.b2 f17323c;

    public aa(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f17321a = i10;
        this.f17322b = context;
        this.f17323c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17321a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f17322b, this.f17323c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f17322b, this.f17323c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17322b, this.f17323c);
                return;
        }
    }
}
