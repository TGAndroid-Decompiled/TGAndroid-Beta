package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class we implements Runnable {
    public final int f19992a;
    public final MessagesStorage f19993b;
    public final Utilities.Callback f19994c;
    public final long d;
    public final long e;

    public we(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f19992a = i10;
        this.f19993b = messagesStorage;
        this.f19994c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f19992a) {
            case 0:
                this.f19993b.lambda$getEphemeralMessages$208(this.f19994c, this.d, this.e);
                return;
            default:
                this.f19993b.lambda$getEphemeralMessages$207(this.f19994c, this.d, this.e);
                return;
        }
    }
}
