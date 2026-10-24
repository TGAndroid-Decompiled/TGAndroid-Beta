package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class bf implements Runnable {
    public final int f18019a;
    public final MessagesStorage f18020b;
    public final Utilities.Callback f18021c;
    public final long d;
    public final long e;

    public bf(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f18019a = i10;
        this.f18020b = messagesStorage;
        this.f18021c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18019a) {
            case 0:
                this.f18020b.lambda$getEphemeralMessages$208(this.f18021c, this.d, this.e);
                return;
            default:
                this.f18020b.lambda$getEphemeralMessages$207(this.f18021c, this.d, this.e);
                return;
        }
    }
}
