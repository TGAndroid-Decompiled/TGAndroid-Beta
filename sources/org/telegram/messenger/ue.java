package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ue implements Runnable {
    public final int f21439a;
    public final MessagesStorage f21440b;
    public final Utilities.Callback f21441c;
    public final long d;
    public final long e;

    public ue(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f21439a = i10;
        this.f21440b = messagesStorage;
        this.f21441c = callback;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f21439a) {
            case 0:
                this.f21440b.lambda$getEphemeralMessages$212(this.f21441c, this.d, this.e);
                return;
            default:
                this.f21440b.lambda$getEphemeralMessages$211(this.f21441c, this.d, this.e);
                return;
        }
    }
}
