package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f15960a;
    public final Context f15961b;
    public final org.telegram.ui.ActionBar.b2 f15962c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f15960a = i10;
        this.f15961b = context;
        this.f15962c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f15960a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f15961b, this.f15962c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f15961b, this.f15962c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f15961b, this.f15962c);
                return;
        }
    }
}
