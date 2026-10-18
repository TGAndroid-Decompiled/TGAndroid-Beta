package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xe implements Runnable {
    public final int f20083a;
    public final MessagesStorage f20084b;
    public final Utilities.Callback f20085c;
    public final long d;
    public final long e;

    public xe(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f20083a = i10;
        this.f20084b = messagesStorage;
        this.f20085c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20083a) {
            case 0:
                this.f20084b.lambda$getEphemeralMessages$208(this.f20085c, this.d, this.e);
                return;
            default:
                this.f20084b.lambda$getEphemeralMessages$207(this.f20085c, this.d, this.e);
                return;
        }
    }
}
