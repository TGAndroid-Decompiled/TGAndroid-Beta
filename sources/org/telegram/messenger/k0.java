package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f16781a;
    public final BotForumHelper f16782b;
    public final long f16783c;
    public final int d;
    public final long e;

    public k0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f16781a = i11;
        this.f16782b = botForumHelper;
        this.f16783c = j3;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16781a) {
            case 0:
                BotForumHelper.a(this.f16782b, this.f16783c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f16782b, this.f16783c, this.d, this.e);
                return;
        }
    }
}
