package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ke implements Runnable {
    public final int f16835a;
    public final int f16836b;
    public final Utilities.Callback2 f16837c;

    public ke(int i10, int i11, Utilities.Callback2 callback2) {
        this.f16835a = i11;
        this.f16836b = i10;
        this.f16837c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f16835a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f16836b, this.f16837c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f16836b, this.f16837c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f16836b, this.f16837c);
                return;
        }
    }
}
