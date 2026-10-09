package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ke implements Runnable {
    public final int f18356a;
    public final int f18357b;
    public final Utilities.Callback2 f18358c;

    public ke(int i10, int i11, Utilities.Callback2 callback2) {
        this.f18356a = i11;
        this.f18357b = i10;
        this.f18358c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f18356a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f18357b, this.f18358c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f18357b, this.f18358c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f18357b, this.f18358c);
                return;
        }
    }
}
