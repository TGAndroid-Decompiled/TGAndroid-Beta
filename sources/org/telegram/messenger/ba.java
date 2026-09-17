package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f15746a;
    public final Context f15747b;
    public final org.telegram.ui.ActionBar.c2 f15748c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f15746a = i10;
        this.f15747b = context;
        this.f15748c = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f15746a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f15747b, this.f15748c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f15747b, this.f15748c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f15747b, this.f15748c);
                return;
        }
    }
}
