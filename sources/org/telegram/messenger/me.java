package org.telegram.messenger;
public final class me implements Runnable {
    public final int f20979a;
    public final MessagesStorage f20980b;
    public final long f20981c;
    public final long d;
    public final String f20982e;

    public me(MessagesStorage messagesStorage, long j10, long j11, String str, int i9) {
        this.f20979a = i9;
        this.f20980b = messagesStorage;
        this.f20981c = j10;
        this.d = j11;
        this.f20982e = str;
    }

    @Override
    public final void run() {
        switch (this.f20979a) {
            case 0:
                this.f20980b.lambda$updateRanksInLastMessages$45(this.f20981c, this.d, this.f20982e);
                return;
            default:
                this.f20980b.lambda$updateRanksInLastMessages$46(this.f20981c, this.d, this.f20982e);
                return;
        }
    }
}
