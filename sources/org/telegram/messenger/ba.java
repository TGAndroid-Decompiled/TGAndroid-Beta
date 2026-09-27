package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f15971a;
    public final Context f15972b;
    public final org.telegram.ui.ActionBar.c2 f15973c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f15971a = i10;
        this.f15972b = context;
        this.f15973c = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f15971a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f15972b, this.f15973c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f15972b, this.f15973c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f15972b, this.f15973c);
                return;
        }
    }
}
