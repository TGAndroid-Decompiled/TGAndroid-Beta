package org.telegram.messenger;
public final class oe implements Runnable {
    public final int f19194a;
    public final MessagesStorage f19195b;
    public final long f19196c;
    public final long d;
    public final String e;

    public oe(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f19194a = i10;
        this.f19195b = messagesStorage;
        this.f19196c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f19194a) {
            case 0:
                this.f19195b.lambda$updateRanksInLastMessages$45(this.f19196c, this.d, this.e);
                return;
            default:
                this.f19195b.lambda$updateRanksInLastMessages$46(this.f19196c, this.d, this.e);
                return;
        }
    }
}
