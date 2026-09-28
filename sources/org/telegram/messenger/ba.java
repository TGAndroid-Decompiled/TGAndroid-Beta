package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f15978a;
    public final Context f15979b;
    public final org.telegram.ui.ActionBar.a2 f15980c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f15978a = i10;
        this.f15979b = context;
        this.f15980c = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f15978a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f15979b, this.f15980c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f15979b, this.f15980c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f15979b, this.f15980c);
                return;
        }
    }
}
