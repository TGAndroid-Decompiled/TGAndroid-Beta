package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f18848a;
    public final MessagesStorage f18849b;
    public final long f18850c;
    public final long d;
    public final String f18851e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f18848a = i10;
        this.f18849b = messagesStorage;
        this.f18850c = j3;
        this.d = j10;
        this.f18851e = str;
    }

    @Override
    public final void run() {
        switch (this.f18848a) {
            case 0:
                this.f18849b.lambda$updateRanksInLastMessages$45(this.f18850c, this.d, this.f18851e);
                return;
            default:
                this.f18849b.lambda$updateRanksInLastMessages$46(this.f18850c, this.d, this.f18851e);
                return;
        }
    }
}
