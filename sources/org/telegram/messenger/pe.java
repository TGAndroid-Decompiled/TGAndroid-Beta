package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class pe implements Runnable {
    public final int f19692a;
    public final int f19693b;
    public final Utilities.Callback2 f19694c;

    public pe(int i10, int i11, Utilities.Callback2 callback2) {
        this.f19692a = i11;
        this.f19693b = i10;
        this.f19694c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f19692a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f19693b, this.f19694c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f19693b, this.f19694c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f19693b, this.f19694c);
                return;
        }
    }
}
