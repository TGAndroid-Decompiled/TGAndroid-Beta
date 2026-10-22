package org.telegram.messenger;
public final class te implements Runnable {
    public final int f19607a;
    public final MessagesStorage f19608b;
    public final long f19609c;
    public final long d;
    public final String e;

    public te(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f19607a = i10;
        this.f19608b = messagesStorage;
        this.f19609c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f19607a) {
            case 0:
                this.f19608b.lambda$updateRanksInLastMessages$45(this.f19609c, this.d, this.e);
                return;
            default:
                this.f19608b.lambda$updateRanksInLastMessages$46(this.f19609c, this.d, this.e);
                return;
        }
    }
}
