package org.telegram.messenger;
public final class re implements Runnable {
    public final int f18896a;
    public final MessagesStorage f18897b;
    public final long f18898c;
    public final long d;
    public final String f18899e;

    public re(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f18896a = i10;
        this.f18897b = messagesStorage;
        this.f18898c = j3;
        this.d = j10;
        this.f18899e = str;
    }

    @Override
    public final void run() {
        switch (this.f18896a) {
            case 0:
                this.f18897b.lambda$updateRanksInLastMessages$45(this.f18898c, this.d, this.f18899e);
                return;
            default:
                this.f18897b.lambda$updateRanksInLastMessages$46(this.f18898c, this.d, this.f18899e);
                return;
        }
    }
}
