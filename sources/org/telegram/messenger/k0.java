package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f16798a;
    public final BotForumHelper f16799b;
    public final long f16800c;
    public final int d;
    public final long e;

    public k0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f16798a = i11;
        this.f16799b = botForumHelper;
        this.f16800c = j3;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16798a) {
            case 0:
                BotForumHelper.a(this.f16799b, this.f16800c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f16799b, this.f16800c, this.d, this.e);
                return;
        }
    }
}
