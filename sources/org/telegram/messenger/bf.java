package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class bf implements Runnable {
    public final int f17183a;
    public final MessagesStorage f17184b;
    public final Utilities.Callback f17185c;
    public final long d;
    public final long f17186e;

    public bf(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f17183a = i10;
        this.f17184b = messagesStorage;
        this.f17185c = callback;
        this.d = j3;
        this.f17186e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17183a) {
            case 0:
                this.f17184b.lambda$getEphemeralMessages$208(this.f17185c, this.d, this.f17186e);
                return;
            default:
                this.f17184b.lambda$getEphemeralMessages$207(this.f17185c, this.d, this.f17186e);
                return;
        }
    }
}
