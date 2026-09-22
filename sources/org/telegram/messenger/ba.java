package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f15975a;
    public final Context f15976b;
    public final org.telegram.ui.ActionBar.b2 f15977c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f15975a = i10;
        this.f15976b = context;
        this.f15977c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f15975a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f15976b, this.f15977c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f15976b, this.f15977c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f15976b, this.f15977c);
                return;
        }
    }
}
