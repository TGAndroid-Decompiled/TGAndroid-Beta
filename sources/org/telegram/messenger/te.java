package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
public final class te implements Runnable {
    public final int f16410a;
    public final int f16411b;
    public final Utilities.Callback2 f16412c;

    public te(int i10, int i11, Utilities.Callback2 callback2) {
        this.f16410a = i11;
        this.f16411b = i10;
        this.f16412c = callback2;
    }

    @Override
    public final void run() {
        switch (this.f16410a) {
            case 0:
                MessagesController.AnonymousClass1.lambda$getLocal$1(this.f16411b, this.f16412c);
                return;
            case 1:
                MessagesController.AnonymousClass4.lambda$getLocal$1(this.f16411b, this.f16412c);
                return;
            default:
                MessagesController.AnonymousClass5.lambda$getLocal$2(this.f16411b, this.f16412c);
                return;
        }
    }
}
