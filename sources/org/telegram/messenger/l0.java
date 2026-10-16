package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f17434a;
    public final BotForumHelper f17435b;
    public final long f17436c;
    public final int d;
    public final long e;

    public l0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f17434a = i11;
        this.f17435b = botForumHelper;
        this.f17436c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f17434a) {
            case 0:
                BotForumHelper.a(this.f17435b, this.f17436c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f17435b, this.f17436c, this.d, this.e);
                return;
        }
    }
}
