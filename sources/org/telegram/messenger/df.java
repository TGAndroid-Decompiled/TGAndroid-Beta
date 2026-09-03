package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class df implements Runnable {
    public final int f17053a;
    public final MessagesStorage f17054b;
    public final Utilities.Callback f17055c;
    public final long d;
    public final long e;

    public df(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f17053a = i10;
        this.f17054b = messagesStorage;
        this.f17055c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f17053a) {
            case 0:
                this.f17054b.lambda$getEphemeralMessages$208(this.f17055c, this.d, this.e);
                return;
            default:
                this.f17054b.lambda$getEphemeralMessages$207(this.f17055c, this.d, this.e);
                return;
        }
    }
}
