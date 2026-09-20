package org.telegram.messenger;
public final class re implements Runnable {
    public final int f17459a;
    public final MessagesStorage f17460b;
    public final long f17461c;
    public final long d;
    public final String e;

    public re(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f17459a = i10;
        this.f17460b = messagesStorage;
        this.f17461c = j3;
        this.d = j10;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f17459a) {
            case 0:
                this.f17460b.lambda$updateRanksInLastMessages$45(this.f17461c, this.d, this.e);
                return;
            default:
                this.f17460b.lambda$updateRanksInLastMessages$46(this.f17461c, this.d, this.e);
                return;
        }
    }
}
