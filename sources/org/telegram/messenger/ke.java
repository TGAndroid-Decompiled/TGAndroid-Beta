package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ke implements Runnable {
    public final int f18375a;
    public final int f18376b;
    public final Utilities.Callback2 f18377c;

    public ke(int i10, int i11, Utilities.Callback2 callback2) {
        this.f18375a = i11;
        this.f18376b = i10;
        this.f18377c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f18375a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f18376b, this.f18377c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f18376b, this.f18377c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f18376b, this.f18377c);
                return;
        }
    }
}
