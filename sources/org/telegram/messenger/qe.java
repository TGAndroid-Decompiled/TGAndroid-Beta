package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f17407a;
    public final MessagesStorage f17408b;
    public final long f17409c;
    public final long d;
    public final String e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f17407a = i10;
        this.f17408b = messagesStorage;
        this.f17409c = j3;
        this.d = j10;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f17407a) {
            case 0:
                this.f17408b.lambda$updateRanksInLastMessages$45(this.f17409c, this.d, this.e);
                return;
            default:
                this.f17408b.lambda$updateRanksInLastMessages$46(this.f17409c, this.d, this.e);
                return;
        }
    }
}
