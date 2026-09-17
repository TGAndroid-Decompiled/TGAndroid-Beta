package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ke implements Runnable {
    public final int f18225a;
    public final int f18226b;
    public final Utilities.Callback2 f18227c;

    public ke(int i10, int i11, Utilities.Callback2 callback2) {
        this.f18225a = i11;
        this.f18226b = i10;
        this.f18227c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f18225a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f18226b, this.f18227c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f18226b, this.f18227c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f18226b, this.f18227c);
                return;
        }
    }
}
