package org.telegram.messenger;
public final class se implements Runnable {
    public final int f19531a;
    public final MessagesStorage f19532b;
    public final long f19533c;
    public final long d;
    public final String e;

    public se(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f19531a = i10;
        this.f19532b = messagesStorage;
        this.f19533c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f19531a) {
            case 0:
                this.f19532b.lambda$updateRanksInLastMessages$45(this.f19533c, this.d, this.e);
                return;
            default:
                this.f19532b.lambda$updateRanksInLastMessages$46(this.f19533c, this.d, this.e);
                return;
        }
    }
}
