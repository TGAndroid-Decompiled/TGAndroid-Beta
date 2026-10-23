package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class af implements Runnable {
    public final int f17884a;
    public final MessagesStorage f17885b;
    public final Utilities.Callback f17886c;
    public final long d;
    public final long e;

    public af(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f17884a = i10;
        this.f17885b = messagesStorage;
        this.f17886c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f17884a) {
            case 0:
                this.f17885b.lambda$getEphemeralMessages$208(this.f17886c, this.d, this.e);
                return;
            default:
                this.f17885b.lambda$getEphemeralMessages$207(this.f17886c, this.d, this.e);
                return;
        }
    }
}
