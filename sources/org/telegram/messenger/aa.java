package org.telegram.messenger;

import android.content.Context;
public final class aa implements Runnable {
    public final int f19608a;
    public final Context f19609b;
    public final org.telegram.ui.ActionBar.e2 f19610c;

    public aa(int i10, Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f19608a = i10;
        this.f19609b = context;
        this.f19610c = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f19608a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f19609b, this.f19610c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f19609b, this.f19610c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f19609b, this.f19610c);
                return;
        }
    }
}
