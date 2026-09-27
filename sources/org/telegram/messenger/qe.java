package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f17388a;
    public final MessagesStorage f17389b;
    public final long f17390c;
    public final long d;
    public final String e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f17388a = i10;
        this.f17389b = messagesStorage;
        this.f17390c = j3;
        this.d = j10;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f17388a) {
            case 0:
                this.f17389b.lambda$updateRanksInLastMessages$45(this.f17390c, this.d, this.e);
                return;
            default:
                this.f17389b.lambda$updateRanksInLastMessages$46(this.f17390c, this.d, this.e);
                return;
        }
    }
}
