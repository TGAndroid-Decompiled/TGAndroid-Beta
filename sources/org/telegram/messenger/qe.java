package org.telegram.messenger;

public final class qe implements Runnable {

    public final int f21363a;

    public final MessagesStorage f21364b;

    public final long f21365c;
    public final long d;

    public final String f21366e;

    public qe(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f21363a = i10;
        this.f21364b = messagesStorage;
        this.f21365c = j10;
        this.d = j11;
        this.f21366e = str;
    }

    @Override
    public final void run() {
        switch (this.f21363a) {
            case 0:
                this.f21364b.lambda$updateRanksInLastMessages$45(this.f21365c, this.d, this.f21366e);
                break;
            default:
                this.f21364b.lambda$updateRanksInLastMessages$46(this.f21365c, this.d, this.f21366e);
                break;
        }
    }
}
