package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class df implements Runnable {
    public final int f18505a;
    public final MessagesStorage f18506b;
    public final Utilities.Callback f18507c;
    public final long d;
    public final long f18508e;

    public df(MessagesStorage messagesStorage, Utilities.Callback callback, long j10, long j11, int i10) {
        this.f18505a = i10;
        this.f18506b = messagesStorage;
        this.f18507c = callback;
        this.d = j10;
        this.f18508e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18505a) {
            case 0:
                this.f18506b.lambda$getEphemeralMessages$208(this.f18507c, this.d, this.f18508e);
                return;
            default:
                this.f18506b.lambda$getEphemeralMessages$207(this.f18507c, this.d, this.f18508e);
                return;
        }
    }
}
