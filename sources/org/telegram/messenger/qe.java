package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f17390a;
    public final MessagesStorage f17391b;
    public final long f17392c;
    public final long d;
    public final String e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f17390a = i10;
        this.f17391b = messagesStorage;
        this.f17392c = j3;
        this.d = j10;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f17390a) {
            case 0:
                this.f17391b.lambda$updateRanksInLastMessages$45(this.f17392c, this.d, this.e);
                return;
            default:
                this.f17391b.lambda$updateRanksInLastMessages$46(this.f17392c, this.d, this.e);
                return;
        }
    }
}
