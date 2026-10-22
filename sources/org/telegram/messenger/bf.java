package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class bf implements Runnable {
    public final int f17956a;
    public final MessagesStorage f17957b;
    public final Utilities.Callback f17958c;
    public final long d;
    public final long e;

    public bf(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f17956a = i10;
        this.f17957b = messagesStorage;
        this.f17958c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f17956a) {
            case 0:
                this.f17957b.lambda$getEphemeralMessages$208(this.f17958c, this.d, this.e);
                return;
            default:
                this.f17957b.lambda$getEphemeralMessages$207(this.f17958c, this.d, this.e);
                return;
        }
    }
}
