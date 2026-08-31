package org.telegram.messenger;

import android.content.Context;
public final class fa implements Runnable {
    public final int f18643a;
    public final Context f18644b;
    public final org.telegram.ui.ActionBar.d2 f18645c;

    public fa(int i10, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f18643a = i10;
        this.f18644b = context;
        this.f18645c = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f18643a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f18644b, this.f18645c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f18644b, this.f18645c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f18644b, this.f18645c);
                return;
        }
    }
}
