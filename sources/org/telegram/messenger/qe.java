package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f18956a;
    public final MessagesStorage f18957b;
    public final long f18958c;
    public final long d;
    public final String f18959e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f18956a = i10;
        this.f18957b = messagesStorage;
        this.f18958c = j3;
        this.d = j10;
        this.f18959e = str;
    }

    @Override
    public final void run() {
        switch (this.f18956a) {
            case 0:
                this.f18957b.lambda$updateRanksInLastMessages$45(this.f18958c, this.d, this.f18959e);
                return;
            default:
                this.f18957b.lambda$updateRanksInLastMessages$46(this.f18958c, this.d, this.f18959e);
                return;
        }
    }
}
