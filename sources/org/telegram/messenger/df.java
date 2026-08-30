package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class df implements Runnable {
    public final int f17070a;
    public final MessagesStorage f17071b;
    public final Utilities.Callback f17072c;
    public final long d;
    public final long e;

    public df(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f17070a = i10;
        this.f17071b = messagesStorage;
        this.f17072c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f17070a) {
            case 0:
                this.f17071b.lambda$getEphemeralMessages$208(this.f17072c, this.d, this.e);
                return;
            default:
                this.f17071b.lambda$getEphemeralMessages$207(this.f17072c, this.d, this.e);
                return;
        }
    }
}
