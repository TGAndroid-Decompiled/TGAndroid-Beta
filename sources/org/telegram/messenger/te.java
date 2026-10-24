package org.telegram.messenger;
public final class te implements Runnable {
    public final int f19674a;
    public final MessagesStorage f19675b;
    public final long f19676c;
    public final long d;
    public final String e;

    public te(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f19674a = i10;
        this.f19675b = messagesStorage;
        this.f19676c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f19674a) {
            case 0:
                this.f19675b.lambda$updateRanksInLastMessages$45(this.f19676c, this.d, this.e);
                return;
            default:
                this.f19675b.lambda$updateRanksInLastMessages$46(this.f19676c, this.d, this.e);
                return;
        }
    }
}
