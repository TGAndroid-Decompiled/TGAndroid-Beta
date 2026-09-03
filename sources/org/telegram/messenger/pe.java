package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class pe implements Runnable {
    public final int f18111a;
    public final int f18112b;
    public final Utilities.Callback2 f18113c;

    public pe(int i10, int i11, Utilities.Callback2 callback2) {
        this.f18111a = i11;
        this.f18112b = i10;
        this.f18113c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f18111a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f18112b, this.f18113c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f18112b, this.f18113c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f18112b, this.f18113c);
                return;
        }
    }
}
