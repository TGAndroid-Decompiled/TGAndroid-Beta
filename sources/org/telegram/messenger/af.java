package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class af implements Runnable {
    public final int f17947a;
    public final MessagesStorage f17948b;
    public final Utilities.Callback f17949c;
    public final long d;
    public final long e;

    public af(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f17947a = i10;
        this.f17948b = messagesStorage;
        this.f17949c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f17947a) {
            case 0:
                this.f17948b.lambda$getEphemeralMessages$208(this.f17949c, this.d, this.e);
                return;
            default:
                this.f17948b.lambda$getEphemeralMessages$207(this.f17949c, this.d, this.e);
                return;
        }
    }
}
