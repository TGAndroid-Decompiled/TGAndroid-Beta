package org.telegram.messenger;
public final class re implements Runnable {
    public final int f18923a;
    public final MessagesStorage f18924b;
    public final long f18925c;
    public final long d;
    public final String f18926e;

    public re(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f18923a = i10;
        this.f18924b = messagesStorage;
        this.f18925c = j3;
        this.d = j10;
        this.f18926e = str;
    }

    @Override
    public final void run() {
        switch (this.f18923a) {
            case 0:
                this.f18924b.lambda$updateRanksInLastMessages$45(this.f18925c, this.d, this.f18926e);
                return;
            default:
                this.f18924b.lambda$updateRanksInLastMessages$46(this.f18925c, this.d, this.f18926e);
                return;
        }
    }
}
