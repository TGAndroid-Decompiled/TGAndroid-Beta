package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f15722a;
    public final Context f15723b;
    public final org.telegram.ui.ActionBar.b2 f15724c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f15722a = i10;
        this.f15723b = context;
        this.f15724c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f15722a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f15723b, this.f15724c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f15723b, this.f15724c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f15723b, this.f15724c);
                return;
        }
    }
}
