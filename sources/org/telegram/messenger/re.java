package org.telegram.messenger;
public final class re implements Runnable {
    public final int f17418a;
    public final MessagesStorage f17419b;
    public final long f17420c;
    public final long d;
    public final String e;

    public re(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f17418a = i10;
        this.f17419b = messagesStorage;
        this.f17420c = j3;
        this.d = j10;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f17418a) {
            case 0:
                this.f17419b.lambda$updateRanksInLastMessages$45(this.f17420c, this.d, this.e);
                return;
            default:
                this.f17419b.lambda$updateRanksInLastMessages$46(this.f17420c, this.d, this.e);
                return;
        }
    }
}
