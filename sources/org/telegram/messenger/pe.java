package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class pe implements Runnable {
    public final int f20960a;
    public final int f20961b;
    public final Utilities.Callback2 f20962c;

    public pe(int i10, int i11, Utilities.Callback2 callback2) {
        this.f20960a = i11;
        this.f20961b = i10;
        this.f20962c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f20960a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f20961b, this.f20962c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f20961b, this.f20962c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f20961b, this.f20962c);
                return;
        }
    }
}
