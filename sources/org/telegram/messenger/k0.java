package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f18802a;
    public final BotForumHelper f18803b;
    public final long f18804c;
    public final int d;
    public final long e;

    public k0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f18802a = i11;
        this.f18803b = botForumHelper;
        this.f18804c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18802a) {
            case 0:
                BotForumHelper.a(this.f18803b, this.f18804c, this.d, this.e);
                return;
            default:
                BotForumHelper.c(this.f18803b, this.f18804c, this.d, this.e);
                return;
        }
    }
}
