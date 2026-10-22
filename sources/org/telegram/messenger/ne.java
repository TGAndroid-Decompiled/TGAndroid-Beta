package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class ne implements Runnable {
    public final int f19053a;
    public final int f19054b;
    public final Utilities.Callback2 f19055c;

    public ne(int i10, int i11, Utilities.Callback2 callback2) {
        this.f19053a = i11;
        this.f19054b = i10;
        this.f19055c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f19053a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f19054b, this.f19055c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f19054b, this.f19055c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f19054b, this.f19055c);
                return;
        }
    }
}
