package org.telegram.messenger;

import android.content.Context;
public final class aa implements Runnable {
    public final int f17316a;
    public final Context f17317b;
    public final org.telegram.ui.ActionBar.a2 f17318c;

    public aa(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f17316a = i10;
        this.f17317b = context;
        this.f17318c = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f17316a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f17317b, this.f17318c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f17317b, this.f17318c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17317b, this.f17318c);
                return;
        }
    }
}
