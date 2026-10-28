package org.telegram.messenger;
public final class n0 implements Runnable {
    public final int f20718a;
    public final BotForumHelper f20719b;
    public final long f20720c;
    public final int d;
    public final long e;

    public n0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f20718a = i11;
        this.f20719b = botForumHelper;
        this.f20720c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20718a) {
            case 0:
                BotForumHelper.a(this.f20719b, this.f20720c, this.d, this.e);
                return;
            default:
                BotForumHelper.c(this.f20719b, this.f20720c, this.d, this.e);
                return;
        }
    }
}
