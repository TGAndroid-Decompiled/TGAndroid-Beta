package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f18951a;
    public final MessagesStorage f18952b;
    public final long f18953c;
    public final long d;
    public final String f18954e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f18951a = i10;
        this.f18952b = messagesStorage;
        this.f18953c = j3;
        this.d = j10;
        this.f18954e = str;
    }

    @Override
    public final void run() {
        switch (this.f18951a) {
            case 0:
                this.f18952b.lambda$updateRanksInLastMessages$45(this.f18953c, this.d, this.f18954e);
                return;
            default:
                this.f18952b.lambda$updateRanksInLastMessages$46(this.f18953c, this.d, this.f18954e);
                return;
        }
    }
}
