package org.telegram.messenger;

import android.content.Context;

public final class ca implements Runnable {

    public final int f19900a;

    public final Context f19901b;

    public final org.telegram.ui.ActionBar.b2 f19902c;

    public ca(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f19900a = i10;
        this.f19901b = context;
        this.f19902c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f19900a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f19901b, this.f19902c);
                break;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f19901b, this.f19902c);
                break;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f19901b, this.f19902c);
                break;
        }
    }
}
