package org.telegram.messenger;
public final class te implements Runnable {
    public final int f18999a;
    public final MessagesStorage f19000b;
    public final long f19001c;
    public final long d;
    public final String f19002e;

    public te(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f18999a = i10;
        this.f19000b = messagesStorage;
        this.f19001c = j3;
        this.d = j10;
        this.f19002e = str;
    }

    @Override
    public final void run() {
        switch (this.f18999a) {
            case 0:
                this.f19000b.lambda$updateRanksInLastMessages$45(this.f19001c, this.d, this.f19002e);
                return;
            default:
                this.f19000b.lambda$updateRanksInLastMessages$46(this.f19001c, this.d, this.f19002e);
                return;
        }
    }
}
