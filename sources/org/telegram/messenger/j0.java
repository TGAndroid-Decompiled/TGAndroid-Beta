package org.telegram.messenger;
public final class j0 implements Runnable {
    public final int f16674a;
    public final BotForumHelper f16675b;
    public final long f16676c;
    public final int d;
    public final long e;

    public j0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f16674a = i11;
        this.f16675b = botForumHelper;
        this.f16676c = j3;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16674a) {
            case 0:
                BotForumHelper.a(this.f16675b, this.f16676c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f16675b, this.f16676c, this.d, this.e);
                return;
        }
    }
}
