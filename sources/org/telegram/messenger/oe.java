package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class oe implements Runnable {
    public final int f20876a;
    public final int f20877b;
    public final Utilities.Callback2 f20878c;

    public oe(int i10, int i11, Utilities.Callback2 callback2) {
        this.f20876a = i11;
        this.f20877b = i10;
        this.f20878c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f20876a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f20877b, this.f20878c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f20877b, this.f20878c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f20877b, this.f20878c);
                return;
        }
    }
}
