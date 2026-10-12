package org.telegram.messenger;
public final class te implements Runnable {
    public final int f19000a;
    public final MessagesStorage f19001b;
    public final long f19002c;
    public final long d;
    public final String f19003e;

    public te(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f19000a = i10;
        this.f19001b = messagesStorage;
        this.f19002c = j3;
        this.d = j10;
        this.f19003e = str;
    }

    @Override
    public final void run() {
        switch (this.f19000a) {
            case 0:
                this.f19001b.lambda$updateRanksInLastMessages$45(this.f19002c, this.d, this.f19003e);
                return;
            default:
                this.f19001b.lambda$updateRanksInLastMessages$46(this.f19002c, this.d, this.f19003e);
                return;
        }
    }
}
