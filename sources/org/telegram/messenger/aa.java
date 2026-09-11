package org.telegram.messenger;

import android.content.Context;
public final class aa implements Runnable {
    public final int f17151a;
    public final Context f17152b;
    public final org.telegram.ui.ActionBar.b2 f17153c;

    public aa(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f17151a = i10;
        this.f17152b = context;
        this.f17153c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17151a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f17152b, this.f17153c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f17152b, this.f17153c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17152b, this.f17153c);
                return;
        }
    }
}
