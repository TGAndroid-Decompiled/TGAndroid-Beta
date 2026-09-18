package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f15924a;
    public final Context f15925b;
    public final org.telegram.ui.ActionBar.b2 f15926c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f15924a = i10;
        this.f15925b = context;
        this.f15926c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f15924a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f15925b, this.f15926c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f15925b, this.f15926c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f15925b, this.f15926c);
                return;
        }
    }
}
