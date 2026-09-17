package org.telegram.messenger;
public final class qe implements Runnable {
    public final int f18821a;
    public final MessagesStorage f18822b;
    public final long f18823c;
    public final long d;
    public final String f18824e;

    public qe(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f18821a = i10;
        this.f18822b = messagesStorage;
        this.f18823c = j3;
        this.d = j10;
        this.f18824e = str;
    }

    @Override
    public final void run() {
        switch (this.f18821a) {
            case 0:
                this.f18822b.lambda$updateRanksInLastMessages$45(this.f18823c, this.d, this.f18824e);
                return;
            default:
                this.f18822b.lambda$updateRanksInLastMessages$46(this.f18823c, this.d, this.f18824e);
                return;
        }
    }
}
