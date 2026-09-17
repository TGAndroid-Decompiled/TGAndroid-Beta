package org.telegram.messenger;

import android.content.Context;
public final class aa implements Runnable {
    public final int f17178a;
    public final Context f17179b;
    public final org.telegram.ui.ActionBar.b2 f17180c;

    public aa(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f17178a = i10;
        this.f17179b = context;
        this.f17180c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17178a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.f17179b, this.f17180c);
                return;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.f17179b, this.f17180c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f17179b, this.f17180c);
                return;
        }
    }
}
