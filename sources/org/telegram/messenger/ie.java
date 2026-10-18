package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ie implements Runnable {
    public final int f18624a;
    public final int f18625b;
    public final Utilities.Callback2 f18626c;

    public ie(int i10, int i11, Utilities.Callback2 callback2) {
        this.f18624a = i11;
        this.f18625b = i10;
        this.f18626c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f18624a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f18625b, this.f18626c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f18625b, this.f18626c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f18625b, this.f18626c);
                return;
        }
    }
}
