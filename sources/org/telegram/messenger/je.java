package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class je implements Runnable {
    public final int f18702a;
    public final int f18703b;
    public final Utilities.Callback2 f18704c;

    public je(int i10, int i11, Utilities.Callback2 callback2) {
        this.f18702a = i11;
        this.f18703b = i10;
        this.f18704c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f18702a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f18703b, this.f18704c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f18703b, this.f18704c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f18703b, this.f18704c);
                return;
        }
    }
}
