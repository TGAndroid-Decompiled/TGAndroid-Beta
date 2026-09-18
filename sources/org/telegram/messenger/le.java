package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class le implements Runnable {
    public final int f16856a;
    public final int f16857b;
    public final Utilities.Callback2 f16858c;

    public le(int i10, int i11, Utilities.Callback2 callback2) {
        this.f16856a = i11;
        this.f16857b = i10;
        this.f16858c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f16856a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f16857b, this.f16858c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f16857b, this.f16858c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f16857b, this.f16858c);
                return;
        }
    }
}
