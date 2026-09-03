package org.telegram.messenger;

import android.content.Context;
public final class fa implements Runnable {
    public final int f18645a;
    public final Context f18646b;
    public final org.telegram.ui.ActionBar.d2 f18647c;

    public fa(int i10, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f18645a = i10;
        this.f18646b = context;
        this.f18647c = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f18645a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f18646b, this.f18647c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f18646b, this.f18647c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f18646b, this.f18647c);
                return;
        }
    }
}
