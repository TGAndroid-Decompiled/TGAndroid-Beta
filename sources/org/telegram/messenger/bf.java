package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class bf implements Runnable {
    public final int f16878a;
    public final MessagesStorage f16879b;
    public final Utilities.Callback f16880c;
    public final long d;
    public final long e;

    public bf(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f16878a = i10;
        this.f16879b = messagesStorage;
        this.f16880c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f16878a) {
            case 0:
                this.f16879b.lambda$getEphemeralMessages$208(this.f16880c, this.d, this.e);
                return;
            default:
                this.f16879b.lambda$getEphemeralMessages$207(this.f16880c, this.d, this.e);
                return;
        }
    }
}
