package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f17731a;
    public final BotForumHelper f17732b;
    public final long f17733c;
    public final int d;
    public final long e;

    public l0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f17731a = i11;
        this.f17732b = botForumHelper;
        this.f17733c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f17731a) {
            case 0:
                BotForumHelper.a(this.f17732b, this.f17733c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f17732b, this.f17733c, this.d, this.e);
                return;
        }
    }
}
