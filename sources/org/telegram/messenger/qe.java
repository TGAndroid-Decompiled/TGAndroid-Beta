package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f18987a;
    public final MessagesStorage f18988b;
    public final long f18989c;
    public final long d;
    public final String f18990e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f18987a = i10;
        this.f18988b = messagesStorage;
        this.f18989c = j3;
        this.d = j10;
        this.f18990e = str;
    }

    @Override
    public final void run() {
        switch (this.f18987a) {
            case 0:
                this.f18988b.lambda$updateRanksInLastMessages$45(this.f18989c, this.d, this.f18990e);
                return;
            default:
                this.f18988b.lambda$updateRanksInLastMessages$46(this.f18989c, this.d, this.f18990e);
                return;
        }
    }
}
