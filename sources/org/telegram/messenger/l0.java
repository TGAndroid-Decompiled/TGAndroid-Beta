package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f18838a;
    public final BotForumHelper f18839b;
    public final long f18840c;
    public final int d;
    public final long e;

    public l0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f18838a = i11;
        this.f18839b = botForumHelper;
        this.f18840c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18838a) {
            case 0:
                BotForumHelper.a(this.f18839b, this.f18840c, this.d, this.e);
                return;
            default:
                BotForumHelper.c(this.f18839b, this.f18840c, this.d, this.e);
                return;
        }
    }
}
