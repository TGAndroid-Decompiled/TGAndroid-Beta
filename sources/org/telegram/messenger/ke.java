package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ke implements Runnable {
    public final int f16836a;
    public final int f16837b;
    public final Utilities.Callback2 f16838c;

    public ke(int i10, int i11, Utilities.Callback2 callback2) {
        this.f16836a = i11;
        this.f16837b = i10;
        this.f16838c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f16836a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f16837b, this.f16838c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f16837b, this.f16838c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f16837b, this.f16838c);
                return;
        }
    }
}
