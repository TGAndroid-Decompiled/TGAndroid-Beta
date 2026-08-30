package org.telegram.messenger;
public final class ve implements Runnable {
    public final int f18667a;
    public final MessagesStorage f18668b;
    public final long f18669c;
    public final long d;
    public final String e;

    public ve(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f18667a = i10;
        this.f18668b = messagesStorage;
        this.f18669c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f18667a) {
            case 0:
                this.f18668b.lambda$updateRanksInLastMessages$45(this.f18669c, this.d, this.e);
                return;
            default:
                this.f18668b.lambda$updateRanksInLastMessages$46(this.f18669c, this.d, this.e);
                return;
        }
    }
}
