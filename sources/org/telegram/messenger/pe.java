package org.telegram.messenger;
public final class pe implements Runnable {
    public final int f19271a;
    public final MessagesStorage f19272b;
    public final long f19273c;
    public final long d;
    public final String e;

    public pe(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f19271a = i10;
        this.f19272b = messagesStorage;
        this.f19273c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f19271a) {
            case 0:
                this.f19272b.lambda$updateRanksInLastMessages$45(this.f19273c, this.d, this.e);
                return;
            default:
                this.f19272b.lambda$updateRanksInLastMessages$46(this.f19273c, this.d, this.e);
                return;
        }
    }
}
