package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ke implements Runnable {
    public final int f18198a;
    public final int f18199b;
    public final Utilities.Callback2 f18200c;

    public ke(int i10, int i11, Utilities.Callback2 callback2) {
        this.f18198a = i11;
        this.f18199b = i10;
        this.f18200c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f18198a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f18199b, this.f18200c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f18199b, this.f18200c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f18199b, this.f18200c);
                return;
        }
    }
}
