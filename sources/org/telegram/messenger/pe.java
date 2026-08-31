package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class pe implements Runnable {
    public final int f19690a;
    public final int f19691b;
    public final Utilities.Callback2 f19692c;

    public pe(int i10, int i11, Utilities.Callback2 callback2) {
        this.f19690a = i11;
        this.f19691b = i10;
        this.f19692c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f19690a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f19691b, this.f19692c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f19691b, this.f19692c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f19691b, this.f19692c);
                return;
        }
    }
}
