package org.telegram.messenger;
public final class te implements Runnable {
    public final int f21654a;
    public final MessagesStorage f21655b;
    public final long f21656c;
    public final long d;
    public final String f21657e;

    public te(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f21654a = i10;
        this.f21655b = messagesStorage;
        this.f21656c = j10;
        this.d = j11;
        this.f21657e = str;
    }

    @Override
    public final void run() {
        switch (this.f21654a) {
            case 0:
                this.f21655b.lambda$updateRanksInLastMessages$45(this.f21656c, this.d, this.f21657e);
                return;
            default:
                this.f21655b.lambda$updateRanksInLastMessages$46(this.f21656c, this.d, this.f21657e);
                return;
        }
    }
}
