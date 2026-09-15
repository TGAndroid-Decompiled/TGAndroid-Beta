package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f15737a;
    public final Context f15738b;
    public final org.telegram.ui.ActionBar.b2 f15739c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f15737a = i10;
        this.f15738b = context;
        this.f15739c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f15737a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f15738b, this.f15739c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f15738b, this.f15739c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f15738b, this.f15739c);
                return;
        }
    }
}
