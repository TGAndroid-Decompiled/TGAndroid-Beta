package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f18992a;
    public final MessagesStorage f18993b;
    public final long f18994c;
    public final long d;
    public final String f18995e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f18992a = i10;
        this.f18993b = messagesStorage;
        this.f18994c = j3;
        this.d = j10;
        this.f18995e = str;
    }

    @Override
    public final void run() {
        switch (this.f18992a) {
            case 0:
                this.f18993b.lambda$updateRanksInLastMessages$45(this.f18994c, this.d, this.f18995e);
                return;
            default:
                this.f18993b.lambda$updateRanksInLastMessages$46(this.f18994c, this.d, this.f18995e);
                return;
        }
    }
}
