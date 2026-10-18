package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class we implements Runnable {
    public final int f20004a;
    public final MessagesStorage f20005b;
    public final Utilities.Callback f20006c;
    public final long d;
    public final long e;

    public we(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f20004a = i10;
        this.f20005b = messagesStorage;
        this.f20006c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20004a) {
            case 0:
                this.f20005b.lambda$getEphemeralMessages$208(this.f20006c, this.d, this.e);
                return;
            default:
                this.f20005b.lambda$getEphemeralMessages$207(this.f20006c, this.d, this.e);
                return;
        }
    }
}
