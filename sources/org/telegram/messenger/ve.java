package org.telegram.messenger;
public final class ve implements Runnable {
    public final int f18649a;
    public final MessagesStorage f18650b;
    public final long f18651c;
    public final long d;
    public final String e;

    public ve(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f18649a = i10;
        this.f18650b = messagesStorage;
        this.f18651c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f18649a) {
            case 0:
                this.f18650b.lambda$updateRanksInLastMessages$45(this.f18651c, this.d, this.e);
                return;
            default:
                this.f18650b.lambda$updateRanksInLastMessages$46(this.f18651c, this.d, this.e);
                return;
        }
    }
}
