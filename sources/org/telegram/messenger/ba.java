package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f17426a;
    public final Context f17427b;
    public final org.telegram.ui.ActionBar.b2 f17428c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f17426a = i10;
        this.f17427b = context;
        this.f17428c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17426a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f17427b, this.f17428c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f17427b, this.f17428c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17427b, this.f17428c);
                return;
        }
    }
}
