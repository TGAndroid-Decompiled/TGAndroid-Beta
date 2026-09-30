package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f16782a;
    public final BotForumHelper f16783b;
    public final long f16784c;
    public final int d;
    public final long e;

    public k0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f16782a = i11;
        this.f16783b = botForumHelper;
        this.f16784c = j3;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16782a) {
            case 0:
                BotForumHelper.a(this.f16783b, this.f16784c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f16783b, this.f16784c, this.d, this.e);
                return;
        }
    }
}
