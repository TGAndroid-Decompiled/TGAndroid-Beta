package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f18810a;
    public final BotForumHelper f18811b;
    public final long f18812c;
    public final int d;
    public final long e;

    public l0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f18810a = i11;
        this.f18811b = botForumHelper;
        this.f18812c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18810a) {
            case 0:
                BotForumHelper.a(this.f18811b, this.f18812c, this.d, this.e);
                return;
            default:
                BotForumHelper.c(this.f18811b, this.f18812c, this.d, this.e);
                return;
        }
    }
}
