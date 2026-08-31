package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class df implements Runnable {
    public final int f18503a;
    public final MessagesStorage f18504b;
    public final Utilities.Callback f18505c;
    public final long d;
    public final long f18506e;

    public df(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f18503a = i10;
        this.f18504b = messagesStorage;
        this.f18505c = callback;
        this.d = j10;
        this.f18506e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18503a) {
            case 0:
                this.f18504b.lambda$getEphemeralMessages$208(this.f18505c, this.d, this.f18506e);
                return;
            default:
                this.f18504b.lambda$getEphemeralMessages$207(this.f18505c, this.d, this.f18506e);
                return;
        }
    }
}
