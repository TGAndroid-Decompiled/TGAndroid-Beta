package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f20262a;
    public final MessagesStorage f20263b;
    public final long f20264c;
    public final long d;
    public final String e;

    public hg(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f20262a = i10;
        this.f20263b = messagesStorage;
        this.f20264c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f20262a) {
            case 0:
                this.f20263b.lambda$updateRanksInLastMessages$48(this.f20264c, this.d, this.e);
                return;
            default:
                this.f20263b.lambda$updateRanksInLastMessages$49(this.f20264c, this.d, this.e);
                return;
        }
    }
}
