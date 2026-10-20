package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f18840a;
    public final BotForumHelper f18841b;
    public final long f18842c;
    public final int d;
    public final long e;

    public l0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f18840a = i11;
        this.f18841b = botForumHelper;
        this.f18842c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18840a) {
            case 0:
                BotForumHelper.a(this.f18841b, this.f18842c, this.d, this.e);
                return;
            default:
                BotForumHelper.c(this.f18841b, this.f18842c, this.d, this.e);
                return;
        }
    }
}
