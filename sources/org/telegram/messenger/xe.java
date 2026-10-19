package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class xe implements Runnable {
    public final int f20086a;
    public final MessagesStorage f20087b;
    public final Utilities.Callback f20088c;
    public final long d;
    public final long e;

    public xe(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f20086a = i10;
        this.f20087b = messagesStorage;
        this.f20088c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20086a) {
            case 0:
                this.f20087b.lambda$getEphemeralMessages$208(this.f20088c, this.d, this.e);
                return;
            default:
                this.f20087b.lambda$getEphemeralMessages$207(this.f20088c, this.d, this.e);
                return;
        }
    }
}
