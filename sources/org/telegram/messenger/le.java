package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class le implements Runnable {
    public final int f18305a;
    public final int f18306b;
    public final Utilities.Callback2 f18307c;

    public le(int i10, int i11, Utilities.Callback2 callback2) {
        this.f18305a = i11;
        this.f18306b = i10;
        this.f18307c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f18305a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f18306b, this.f18307c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f18306b, this.f18307c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f18306b, this.f18307c);
                return;
        }
    }
}
