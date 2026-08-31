package org.telegram.messenger;
public final class ve implements Runnable {
    public final int f20286a;
    public final MessagesStorage f20287b;
    public final long f20288c;
    public final long d;
    public final String f20289e;

    public ve(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f20286a = i10;
        this.f20287b = messagesStorage;
        this.f20288c = j10;
        this.d = j11;
        this.f20289e = str;
    }

    @Override
    public final void run() {
        switch (this.f20286a) {
            case 0:
                this.f20287b.lambda$updateRanksInLastMessages$45(this.f20288c, this.d, this.f20289e);
                return;
            default:
                this.f20287b.lambda$updateRanksInLastMessages$46(this.f20288c, this.d, this.f20289e);
                return;
        }
    }
}
