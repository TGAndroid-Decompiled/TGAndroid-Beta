package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ne implements Runnable {
    public final int f18387a;
    public final int f18388b;
    public final Utilities.Callback2 f18389c;

    public ne(int i10, int i11, Utilities.Callback2 callback2) {
        this.f18387a = i11;
        this.f18388b = i10;
        this.f18389c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f18387a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f18388b, this.f18389c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f18388b, this.f18389c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f18388b, this.f18389c);
                return;
        }
    }
}
