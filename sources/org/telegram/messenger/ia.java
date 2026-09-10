package org.telegram.messenger;

import android.content.Context;
public final class ia implements Runnable {
    public final int f15442a;
    public final Context f15443b;
    public final org.telegram.ui.ActionBar.d2 f15444c;

    public ia(int i10, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f15442a = i10;
        this.f15443b = context;
        this.f15444c = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f15442a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f15443b, this.f15444c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f15443b, this.f15444c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f15443b, this.f15444c);
                return;
        }
    }
}
