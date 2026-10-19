package org.telegram.messenger;

import android.content.Context;
public final class aa implements Runnable {
    public final int f17855a;
    public final Context f17856b;
    public final org.telegram.ui.ActionBar.b2 f17857c;

    public aa(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f17855a = i10;
        this.f17856b = context;
        this.f17857c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17855a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f17856b, this.f17857c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f17856b, this.f17857c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17856b, this.f17857c);
                return;
        }
    }
}
