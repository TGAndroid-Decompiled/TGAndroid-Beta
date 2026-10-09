package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f18308a;
    public final BotForumHelper f18309b;
    public final long f18310c;
    public final int d;
    public final long f18311e;

    public k0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f18308a = i11;
        this.f18309b = botForumHelper;
        this.f18310c = j3;
        this.d = i10;
        this.f18311e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18308a) {
            case 0:
                BotForumHelper.a(this.f18309b, this.f18310c, this.d, this.f18311e);
                return;
            default:
                BotForumHelper.d(this.f18309b, this.f18310c, this.d, this.f18311e);
                return;
        }
    }
}
