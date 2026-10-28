package org.telegram.messenger;
public final class jg implements Runnable {
    public final int f20441a;
    public final MessagesStorage f20442b;
    public final long f20443c;
    public final long d;
    public final String e;

    public jg(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f20441a = i10;
        this.f20442b = messagesStorage;
        this.f20443c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f20441a) {
            case 0:
                this.f20442b.lambda$updateRanksInLastMessages$48(this.f20443c, this.d, this.e);
                return;
            default:
                this.f20442b.lambda$updateRanksInLastMessages$49(this.f20443c, this.d, this.e);
                return;
        }
    }
}
