package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class bf implements Runnable {
    public final int f17182a;
    public final MessagesStorage f17183b;
    public final Utilities.Callback f17184c;
    public final long d;
    public final long f17185e;

    public bf(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f17182a = i10;
        this.f17183b = messagesStorage;
        this.f17184c = callback;
        this.d = j3;
        this.f17185e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17182a) {
            case 0:
                this.f17183b.lambda$getEphemeralMessages$208(this.f17184c, this.d, this.f17185e);
                return;
            default:
                this.f17183b.lambda$getEphemeralMessages$207(this.f17184c, this.d, this.f17185e);
                return;
        }
    }
}
