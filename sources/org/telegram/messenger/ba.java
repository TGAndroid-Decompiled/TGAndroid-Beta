package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f15977a;
    public final Context f15978b;
    public final org.telegram.ui.ActionBar.a2 f15979c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f15977a = i10;
        this.f15978b = context;
        this.f15979c = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f15977a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f15978b, this.f15979c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f15978b, this.f15979c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f15978b, this.f15979c);
                return;
        }
    }
}
