package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f17421a;
    public final Context f17422b;
    public final org.telegram.ui.ActionBar.b2 f17423c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f17421a = i10;
        this.f17422b = context;
        this.f17423c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17421a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f17422b, this.f17423c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f17422b, this.f17423c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17422b, this.f17423c);
                return;
        }
    }
}
