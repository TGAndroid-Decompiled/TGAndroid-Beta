package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f18947a;
    public final MessagesStorage f18948b;
    public final long f18949c;
    public final long d;
    public final String f18950e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f18947a = i10;
        this.f18948b = messagesStorage;
        this.f18949c = j3;
        this.d = j10;
        this.f18950e = str;
    }

    @Override
    public final void run() {
        switch (this.f18947a) {
            case 0:
                this.f18948b.lambda$updateRanksInLastMessages$45(this.f18949c, this.d, this.f18950e);
                return;
            default:
                this.f18948b.lambda$updateRanksInLastMessages$46(this.f18949c, this.d, this.f18950e);
                return;
        }
    }
}
