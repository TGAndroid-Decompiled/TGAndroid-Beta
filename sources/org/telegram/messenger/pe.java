package org.telegram.messenger;
public final class pe implements Runnable {
    public final int f19268a;
    public final MessagesStorage f19269b;
    public final long f19270c;
    public final long d;
    public final String e;

    public pe(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f19268a = i10;
        this.f19269b = messagesStorage;
        this.f19270c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f19268a) {
            case 0:
                this.f19269b.lambda$updateRanksInLastMessages$45(this.f19270c, this.d, this.e);
                return;
            default:
                this.f19269b.lambda$updateRanksInLastMessages$46(this.f19270c, this.d, this.e);
                return;
        }
    }
}
