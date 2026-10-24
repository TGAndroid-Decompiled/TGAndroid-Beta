package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ne implements Runnable {
    public final int f19119a;
    public final int f19120b;
    public final Utilities.Callback2 f19121c;

    public ne(int i10, int i11, Utilities.Callback2 callback2) {
        this.f19119a = i11;
        this.f19120b = i10;
        this.f19121c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f19119a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f19120b, this.f19121c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f19120b, this.f19121c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f19120b, this.f19121c);
                return;
        }
    }
}
