package org.telegram.messenger;
public final class te implements Runnable {
    public final int f18203a;
    public final MessagesStorage f18204b;
    public final long f18205c;
    public final long d;
    public final String e;

    public te(MessagesStorage messagesStorage, long j10, long j11, String str, int i10) {
        this.f18203a = i10;
        this.f18204b = messagesStorage;
        this.f18205c = j10;
        this.d = j11;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f18203a) {
            case 0:
                this.f18204b.lambda$updateRanksInLastMessages$45(this.f18205c, this.d, this.e);
                return;
            default:
                this.f18204b.lambda$updateRanksInLastMessages$46(this.f18205c, this.d, this.e);
                return;
        }
    }
}
