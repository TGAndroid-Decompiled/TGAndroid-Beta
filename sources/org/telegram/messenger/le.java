package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class le implements Runnable {
    public final int f18278a;
    public final int f18279b;
    public final Utilities.Callback2 f18280c;

    public le(int i10, int i11, Utilities.Callback2 callback2) {
        this.f18278a = i11;
        this.f18279b = i10;
        this.f18280c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f18278a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f18279b, this.f18280c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f18279b, this.f18280c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f18279b, this.f18280c);
                return;
        }
    }
}
