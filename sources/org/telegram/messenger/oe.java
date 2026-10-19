package org.telegram.messenger;
public final class oe implements Runnable {
    public final int f19191a;
    public final MessagesStorage f19192b;
    public final long f19193c;
    public final long d;
    public final String e;

    public oe(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f19191a = i10;
        this.f19192b = messagesStorage;
        this.f19193c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f19191a) {
            case 0:
                this.f19192b.lambda$updateRanksInLastMessages$45(this.f19193c, this.d, this.e);
                return;
            default:
                this.f19192b.lambda$updateRanksInLastMessages$46(this.f19193c, this.d, this.e);
                return;
        }
    }
}
