package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class pe implements Runnable {
    public final int f18133a;
    public final int f18134b;
    public final Utilities.Callback2 f18135c;

    public pe(int i10, int i11, Utilities.Callback2 callback2) {
        this.f18133a = i11;
        this.f18134b = i10;
        this.f18135c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f18133a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f18134b, this.f18135c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f18134b, this.f18135c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f18134b, this.f18135c);
                return;
        }
    }
}
