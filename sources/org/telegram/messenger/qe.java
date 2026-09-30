package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f17391a;
    public final MessagesStorage f17392b;
    public final long f17393c;
    public final long d;
    public final String e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f17391a = i10;
        this.f17392b = messagesStorage;
        this.f17393c = j3;
        this.d = j10;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f17391a) {
            case 0:
                this.f17392b.lambda$updateRanksInLastMessages$45(this.f17393c, this.d, this.e);
                return;
            default:
                this.f17392b.lambda$updateRanksInLastMessages$46(this.f17393c, this.d, this.e);
                return;
        }
    }
}
