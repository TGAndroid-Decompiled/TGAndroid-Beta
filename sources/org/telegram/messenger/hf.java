package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class hf implements Runnable {
    public final int f15383a;
    public final MessagesStorage f15384b;
    public final Utilities.Callback f15385c;
    public final long d;
    public final long e;

    public hf(MessagesStorage messagesStorage, Utilities.Callback callback, long j3, long j10, int i10) {
        this.f15383a = i10;
        this.f15384b = messagesStorage;
        this.f15385c = callback;
        this.d = j3;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f15383a) {
            case 0:
                this.f15384b.lambda$getEphemeralMessages$208(this.f15385c, this.d, this.e);
                return;
            default:
                this.f15384b.lambda$getEphemeralMessages$207(this.f15385c, this.d, this.e);
                return;
        }
    }
}
