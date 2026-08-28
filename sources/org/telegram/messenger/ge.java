package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ge implements Runnable {
    public final int f20394a;
    public final int f20395b;
    public final Utilities.Callback2 f20396c;

    public ge(int i9, int i10, Utilities.Callback2 callback2) {
        this.f20394a = i10;
        this.f20395b = i9;
        this.f20396c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f20394a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f20395b, this.f20396c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f20395b, this.f20396c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f20395b, this.f20396c);
                return;
        }
    }
}
