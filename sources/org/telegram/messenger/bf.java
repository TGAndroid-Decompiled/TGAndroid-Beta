package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class bf implements Runnable {
    public final int f19820a;
    public final MessagesStorage f19821b;
    public final Utilities.Callback f19822c;
    public final long d;
    public final long f19823e;

    public bf(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f19820a = i10;
        this.f19821b = messagesStorage;
        this.f19822c = callback;
        this.d = j10;
        this.f19823e = j11;
    }

    @Override
    public final void run() {
        switch (this.f19820a) {
            case 0:
                this.f19821b.lambda$getEphemeralMessages$208(this.f19822c, this.d, this.f19823e);
                return;
            default:
                this.f19821b.lambda$getEphemeralMessages$207(this.f19822c, this.d, this.f19823e);
                return;
        }
    }
}
