package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f17595a;
    public final BotForumHelper f17596b;
    public final long f17597c;
    public final int d;
    public final long e;

    public k0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f17595a = i11;
        this.f17596b = botForumHelper;
        this.f17597c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f17595a) {
            case 0:
                BotForumHelper.a(this.f17596b, this.f17597c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f17596b, this.f17597c, this.d, this.e);
                return;
        }
    }
}
