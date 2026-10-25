package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class bf implements Runnable {
    public final int f19712a;
    public final MessagesStorage f19713b;
    public final Utilities.Callback f19714c;
    public final long d;
    public final long e;

    public bf(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f19712a = i10;
        this.f19713b = messagesStorage;
        this.f19714c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f19712a) {
            case 0:
                this.f19713b.lambda$getEphemeralMessages$210(this.f19714c, this.d, this.e);
                return;
            default:
                this.f19713b.lambda$getEphemeralMessages$211(this.f19714c, this.d, this.e);
                return;
        }
    }
}
