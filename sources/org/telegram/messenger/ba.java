package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f15994a;
    public final Context f15995b;
    public final org.telegram.ui.ActionBar.a2 f15996c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f15994a = i10;
        this.f15995b = context;
        this.f15996c = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f15994a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f15995b, this.f15996c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f15995b, this.f15996c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f15995b, this.f15996c);
                return;
        }
    }
}
