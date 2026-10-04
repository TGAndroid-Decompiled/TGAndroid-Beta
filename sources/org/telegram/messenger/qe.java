package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f18986a;
    public final MessagesStorage f18987b;
    public final long f18988c;
    public final long d;
    public final String f18989e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f18986a = i10;
        this.f18987b = messagesStorage;
        this.f18988c = j3;
        this.d = j10;
        this.f18989e = str;
    }

    @Override
    public final void run() {
        switch (this.f18986a) {
            case 0:
                this.f18987b.lambda$updateRanksInLastMessages$45(this.f18988c, this.d, this.f18989e);
                return;
            default:
                this.f18987b.lambda$updateRanksInLastMessages$46(this.f18988c, this.d, this.f18989e);
                return;
        }
    }
}
