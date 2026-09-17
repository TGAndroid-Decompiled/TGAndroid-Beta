package org.telegram.messenger;
public final class re implements Runnable {
    public final int f17246a;
    public final MessagesStorage f17247b;
    public final long f17248c;
    public final long d;
    public final String e;

    public re(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f17246a = i10;
        this.f17247b = messagesStorage;
        this.f17248c = j3;
        this.d = j10;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f17246a) {
            case 0:
                this.f17247b.lambda$updateRanksInLastMessages$45(this.f17248c, this.d, this.e);
                return;
            default:
                this.f17247b.lambda$updateRanksInLastMessages$46(this.f17248c, this.d, this.e);
                return;
        }
    }
}
