package org.telegram.messenger;
public final class re implements Runnable {
    public final int f17233a;
    public final MessagesStorage f17234b;
    public final long f17235c;
    public final long d;
    public final String e;

    public re(MessagesStorage messagesStorage, long j3, long j10, String str, int i10) {
        this.f17233a = i10;
        this.f17234b = messagesStorage;
        this.f17235c = j3;
        this.d = j10;
        this.e = str;
    }

    @Override
    public final void run() {
        switch (this.f17233a) {
            case 0:
                this.f17234b.lambda$updateRanksInLastMessages$45(this.f17235c, this.d, this.e);
                return;
            default:
                this.f17234b.lambda$updateRanksInLastMessages$46(this.f17235c, this.d, this.e);
                return;
        }
    }
}
