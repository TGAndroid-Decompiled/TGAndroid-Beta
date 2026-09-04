package org.telegram.messenger;

import android.content.Context;
public final class ba implements Runnable {
    public final int f17228a;
    public final Context f17229b;
    public final org.telegram.ui.ActionBar.b2 f17230c;

    public ba(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f17228a = i10;
        this.f17229b = context;
        this.f17230c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17228a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f17229b, this.f17230c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f17229b, this.f17230c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17229b, this.f17230c);
                return;
        }
    }
}
