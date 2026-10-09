package org.telegram.messenger;

import android.content.Context;
public final class aa implements Runnable {
    public final int f17317a;
    public final Context f17318b;
    public final org.telegram.ui.ActionBar.b2 f17319c;

    public aa(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f17317a = i10;
        this.f17318b = context;
        this.f17319c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17317a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f17318b, this.f17319c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f17318b, this.f17319c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17318b, this.f17319c);
                return;
        }
    }
}
