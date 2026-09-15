package org.telegram.messenger;
public final class re implements Runnable {
    public final int f17237a;
    public final MessagesStorage f17238b;
    public final long f17239c;
    public final long d;
    public final String e;

    public re(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f17237a = i10;
        this.f17238b = messagesStorage;
        this.f17239c = j3;
        this.d = j10;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f17237a) {
            case 0:
                this.f17238b.lambda$updateRanksInLastMessages$45(this.f17239c, this.d, this.e);
                return;
            default:
                this.f17238b.lambda$updateRanksInLastMessages$46(this.f17239c, this.d, this.e);
                return;
        }
    }
}
