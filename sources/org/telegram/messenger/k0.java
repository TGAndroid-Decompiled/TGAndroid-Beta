package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f17616a;
    public final BotForumHelper f17617b;
    public final long f17618c;
    public final int d;
    public final long e;

    public k0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f17616a = i11;
        this.f17617b = botForumHelper;
        this.f17618c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f17616a) {
            case 0:
                BotForumHelper.a(this.f17617b, this.f17618c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f17617b, this.f17618c, this.d, this.e);
                return;
        }
    }
}
