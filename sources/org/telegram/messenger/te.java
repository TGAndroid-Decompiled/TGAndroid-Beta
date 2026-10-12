package org.telegram.messenger;
public final class te implements Runnable {
    public final int f18501a;
    public final MessagesStorage f18502b;
    public final long f18503c;
    public final long d;
    public final String e;

    public te(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f18501a = i10;
        this.f18502b = messagesStorage;
        this.f18503c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f18501a) {
            case 0:
                this.f18502b.lambda$updateRanksInLastMessages$45(this.f18503c, this.d, this.e);
                return;
            default:
                this.f18502b.lambda$updateRanksInLastMessages$46(this.f18503c, this.d, this.e);
                return;
        }
    }
}
