package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f15962a;
    public final Context f15963b;
    public final org.telegram.ui.ActionBar.a2 f15964c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f15962a = i10;
        this.f15963b = context;
        this.f15964c = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f15962a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f15963b, this.f15964c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f15963b, this.f15964c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f15963b, this.f15964c);
                return;
        }
    }
}
