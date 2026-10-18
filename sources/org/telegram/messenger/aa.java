package org.telegram.messenger;

import android.content.Context;
public final class aa implements Runnable {
    public final int f17852a;
    public final Context f17853b;
    public final org.telegram.ui.ActionBar.b2 f17854c;

    public aa(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f17852a = i10;
        this.f17853b = context;
        this.f17854c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17852a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f17853b, this.f17854c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f17853b, this.f17854c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17853b, this.f17854c);
                return;
        }
    }
}
