package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ue implements Runnable {
    public final int f21679a;
    public final MessagesStorage f21680b;
    public final Utilities.Callback f21681c;
    public final long d;
    public final long f21682e;

    public ue(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i9) {
        this.f21679a = i9;
        this.f21680b = messagesStorage;
        this.f21681c = callback;
        this.d = j10;
        this.f21682e = j11;
    }

    @Override
    public final void run() {
        switch (this.f21679a) {
            case 0:
                this.f21680b.lambda$getEphemeralMessages$208(this.f21681c, this.d, this.f21682e);
                return;
            default:
                this.f21680b.lambda$getEphemeralMessages$207(this.f21681c, this.d, this.f21682e);
                return;
        }
    }
}
