package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f17392a;
    public final MessagesStorage f17393b;
    public final long f17394c;
    public final long d;
    public final String e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f17392a = i10;
        this.f17393b = messagesStorage;
        this.f17394c = j3;
        this.d = j10;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f17392a) {
            case 0:
                this.f17393b.lambda$updateRanksInLastMessages$45(this.f17394c, this.d, this.e);
                return;
            default:
                this.f17393b.lambda$updateRanksInLastMessages$46(this.f17394c, this.d, this.e);
                return;
        }
    }
}
