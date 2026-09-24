package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f17377a;
    public final MessagesStorage f17378b;
    public final long f17379c;
    public final long d;
    public final String e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f17377a = i10;
        this.f17378b = messagesStorage;
        this.f17379c = j3;
        this.d = j10;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f17377a) {
            case 0:
                this.f17378b.lambda$updateRanksInLastMessages$45(this.f17379c, this.d, this.e);
                return;
            default:
                this.f17378b.lambda$updateRanksInLastMessages$46(this.f17379c, this.d, this.e);
                return;
        }
    }
}
