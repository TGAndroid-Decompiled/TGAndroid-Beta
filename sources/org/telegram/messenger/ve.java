package org.telegram.messenger;
public final class ve implements Runnable {
    public final int f20288a;
    public final MessagesStorage f20289b;
    public final long f20290c;
    public final long d;
    public final String f20291e;

    public ve(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f20288a = i10;
        this.f20289b = messagesStorage;
        this.f20290c = j10;
        this.d = j11;
        this.f20291e = str;
    }

    @Override
    public final void run() {
        switch (this.f20288a) {
            case 0:
                this.f20289b.lambda$updateRanksInLastMessages$45(this.f20290c, this.d, this.f20291e);
                return;
            default:
                this.f20289b.lambda$updateRanksInLastMessages$46(this.f20290c, this.d, this.f20291e);
                return;
        }
    }
}
