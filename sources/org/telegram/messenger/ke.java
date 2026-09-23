package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ke implements Runnable {
    public final int f16580a;
    public final int f16581b;
    public final Utilities.Callback2 f16582c;

    public ke(int i10, int i11, Utilities.Callback2 callback2) {
        this.f16580a = i11;
        this.f16581b = i10;
        this.f16582c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f16580a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f16581b, this.f16582c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f16581b, this.f16582c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f16581b, this.f16582c);
                return;
        }
    }
}
