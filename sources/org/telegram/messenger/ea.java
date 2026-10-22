package org.telegram.messenger;

import android.content.Context;
public final class ea implements Runnable {
    public final int f18256a;
    public final Context f18257b;
    public final org.telegram.ui.ActionBar.b2 f18258c;

    public ea(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f18256a = i10;
        this.f18257b = context;
        this.f18258c = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f18256a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.f18257b, this.f18258c);
                return;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.f18257b, this.f18258c);
                return;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.f18257b, this.f18258c);
                return;
        }
    }
}
