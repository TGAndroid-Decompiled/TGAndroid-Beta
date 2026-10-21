package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f19363a;
    public final MessagesStorage f19364b;
    public final long f19365c;
    public final long d;
    public final String e;

    public qe(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f19363a = i10;
        this.f19364b = messagesStorage;
        this.f19365c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f19363a) {
            case 0:
                this.f19364b.lambda$updateRanksInLastMessages$45(this.f19365c, this.d, this.e);
                return;
            default:
                this.f19364b.lambda$updateRanksInLastMessages$46(this.f19365c, this.d, this.e);
                return;
        }
    }
}
