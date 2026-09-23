package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f17139a;
    public final MessagesStorage f17140b;
    public final long f17141c;
    public final long d;
    public final String e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f17139a = i10;
        this.f17140b = messagesStorage;
        this.f17141c = j3;
        this.d = j10;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f17139a) {
            case 0:
                this.f17140b.lambda$updateRanksInLastMessages$45(this.f17141c, this.d, this.e);
                return;
            default:
                this.f17140b.lambda$updateRanksInLastMessages$46(this.f17141c, this.d, this.e);
                return;
        }
    }
}
