package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ke implements Runnable {
    public final int f18370a;
    public final int f18371b;
    public final Utilities.Callback2 f18372c;

    public ke(int i10, int i11, Utilities.Callback2 callback2) {
        this.f18370a = i11;
        this.f18371b = i10;
        this.f18372c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f18370a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f18371b, this.f18372c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f18371b, this.f18372c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f18371b, this.f18372c);
                return;
        }
    }
}
