package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ne implements Runnable {
    public final int f17956a;
    public final int f17957b;
    public final Utilities.Callback2 f17958c;

    public ne(int i10, int i11, Utilities.Callback2 callback2) {
        this.f17956a = i11;
        this.f17957b = i10;
        this.f17958c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f17956a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f17957b, this.f17958c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f17957b, this.f17958c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f17957b, this.f17958c);
                return;
        }
    }
}
