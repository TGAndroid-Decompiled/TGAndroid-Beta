package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f15735a;
    public final Context f15736b;
    public final org.telegram.ui.ActionBar.b2 f15737c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f15735a = i10;
        this.f15736b = context;
        this.f15737c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f15735a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f15736b, this.f15737c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f15736b, this.f15737c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f15736b, this.f15737c);
                return;
        }
    }
}
