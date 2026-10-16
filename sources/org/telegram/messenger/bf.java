package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class bf implements Runnable {
    public final int f16578a;
    public final MessagesStorage f16579b;
    public final Utilities.Callback f16580c;
    public final long d;
    public final long e;

    public bf(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f16578a = i10;
        this.f16579b = messagesStorage;
        this.f16580c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f16578a) {
            case 0:
                this.f16579b.lambda$getEphemeralMessages$208(this.f16580c, this.d, this.e);
                return;
            default:
                this.f16579b.lambda$getEphemeralMessages$207(this.f16580c, this.d, this.e);
                return;
        }
    }
}
