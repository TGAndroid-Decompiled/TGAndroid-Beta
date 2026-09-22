package org.telegram.messenger;
public final class re implements Runnable {
    public final int f17474a;
    public final MessagesStorage f17475b;
    public final long f17476c;
    public final long d;
    public final String e;

    public re(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f17474a = i10;
        this.f17475b = messagesStorage;
        this.f17476c = j3;
        this.d = j10;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f17474a) {
            case 0:
                this.f17475b.lambda$updateRanksInLastMessages$45(this.f17476c, this.d, this.e);
                return;
            default:
                this.f17475b.lambda$updateRanksInLastMessages$46(this.f17476c, this.d, this.e);
                return;
        }
    }
}
