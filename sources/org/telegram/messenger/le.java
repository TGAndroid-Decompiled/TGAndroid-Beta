package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class le implements Runnable {
    public final int f16688a;
    public final int f16689b;
    public final Utilities.Callback2 f16690c;

    public le(int i10, int i11, Utilities.Callback2 callback2) {
        this.f16688a = i11;
        this.f16689b = i10;
        this.f16690c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f16688a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f16689b, this.f16690c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f16689b, this.f16690c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f16689b, this.f16690c);
                return;
        }
    }
}
