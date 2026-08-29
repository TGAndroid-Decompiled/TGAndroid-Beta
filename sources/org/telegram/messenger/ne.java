package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ne implements Runnable {
    public final int f21069a;
    public final int f21070b;
    public final Utilities.Callback2 f21071c;

    public ne(int i10, int i11, Utilities.Callback2 callback2) {
        this.f21069a = i11;
        this.f21070b = i10;
        this.f21071c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f21069a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f21070b, this.f21071c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f21070b, this.f21071c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f21070b, this.f21071c);
                return;
        }
    }
}
