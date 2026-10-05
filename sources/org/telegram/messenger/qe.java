package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f18991a;
    public final MessagesStorage f18992b;
    public final long f18993c;
    public final long d;
    public final String f18994e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f18991a = i10;
        this.f18992b = messagesStorage;
        this.f18993c = j3;
        this.d = j10;
        this.f18994e = str;
    }

    @Override
    public final void run() {
        switch (this.f18991a) {
            case 0:
                this.f18992b.lambda$updateRanksInLastMessages$45(this.f18993c, this.d, this.f18994e);
                return;
            default:
                this.f18992b.lambda$updateRanksInLastMessages$46(this.f18993c, this.d, this.f18994e);
                return;
        }
    }
}
