package org.telegram.messenger;
public final class n0 implements Runnable {
    public final int f20724a;
    public final BotForumHelper f20725b;
    public final long f20726c;
    public final int d;
    public final long e;

    public n0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f20724a = i11;
        this.f20725b = botForumHelper;
        this.f20726c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20724a) {
            case 0:
                BotForumHelper.a(this.f20725b, this.f20726c, this.d, this.e);
                return;
            default:
                BotForumHelper.c(this.f20725b, this.f20726c, this.d, this.e);
                return;
        }
    }
}
