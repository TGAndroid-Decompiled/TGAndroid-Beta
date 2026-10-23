package org.telegram.messenger;
public final class se implements Runnable {
    public final int f19599a;
    public final MessagesStorage f19600b;
    public final long f19601c;
    public final long d;
    public final String e;

    public se(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f19599a = i10;
        this.f19600b = messagesStorage;
        this.f19601c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f19599a) {
            case 0:
                this.f19600b.lambda$updateRanksInLastMessages$45(this.f19601c, this.d, this.e);
                return;
            default:
                this.f19600b.lambda$updateRanksInLastMessages$46(this.f19601c, this.d, this.e);
                return;
        }
    }
}
