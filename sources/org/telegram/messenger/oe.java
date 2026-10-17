package org.telegram.messenger;
public final class oe implements Runnable {
    public final int f19192a;
    public final MessagesStorage f19193b;
    public final long f19194c;
    public final long d;
    public final String e;

    public oe(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f19192a = i10;
        this.f19193b = messagesStorage;
        this.f19194c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f19192a) {
            case 0:
                this.f19193b.lambda$updateRanksInLastMessages$45(this.f19194c, this.d, this.e);
                return;
            default:
                this.f19193b.lambda$updateRanksInLastMessages$46(this.f19194c, this.d, this.e);
                return;
        }
    }
}
