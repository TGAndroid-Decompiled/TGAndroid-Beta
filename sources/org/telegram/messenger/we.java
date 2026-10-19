package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class we implements Runnable {
    public final int f19998a;
    public final MessagesStorage f19999b;
    public final Utilities.Callback f20000c;
    public final long d;
    public final long e;

    public we(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f19998a = i10;
        this.f19999b = messagesStorage;
        this.f20000c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f19998a) {
            case 0:
                this.f19999b.lambda$getEphemeralMessages$208(this.f20000c, this.d, this.e);
                return;
            default:
                this.f19999b.lambda$getEphemeralMessages$207(this.f20000c, this.d, this.e);
                return;
        }
    }
}
