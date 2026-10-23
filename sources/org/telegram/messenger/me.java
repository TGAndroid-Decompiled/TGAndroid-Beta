package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class me implements Runnable {
    public final int f18981a;
    public final int f18982b;
    public final Utilities.Callback2 f18983c;

    public me(int i10, int i11, Utilities.Callback2 callback2) {
        this.f18981a = i11;
        this.f18982b = i10;
        this.f18983c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f18981a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f18982b, this.f18983c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f18982b, this.f18983c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f18982b, this.f18983c);
                return;
        }
    }
}
