package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f19366a;
    public final MessagesStorage f19367b;
    public final long f19368c;
    public final long d;
    public final String e;

    public qe(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f19366a = i10;
        this.f19367b = messagesStorage;
        this.f19368c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f19366a) {
            case 0:
                this.f19367b.lambda$updateRanksInLastMessages$45(this.f19368c, this.d, this.e);
                return;
            default:
                this.f19367b.lambda$updateRanksInLastMessages$46(this.f19368c, this.d, this.e);
                return;
        }
    }
}
