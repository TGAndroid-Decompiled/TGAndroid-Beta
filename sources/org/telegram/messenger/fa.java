package org.telegram.messenger;

import android.content.Context;
public final class fa implements Runnable {
    public final int f17180a;
    public final Context f17181b;
    public final org.telegram.ui.ActionBar.d2 f17182c;

    public fa(int i10, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f17180a = i10;
        this.f17181b = context;
        this.f17182c = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f17180a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f17181b, this.f17182c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f17181b, this.f17182c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17181b, this.f17182c);
                return;
        }
    }
}
