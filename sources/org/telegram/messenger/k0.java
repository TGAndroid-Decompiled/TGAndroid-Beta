package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f16712a;
    public final BotForumHelper f16713b;
    public final long f16714c;
    public final int d;
    public final long e;

    public k0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f16712a = i11;
        this.f16713b = botForumHelper;
        this.f16714c = j3;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16712a) {
            case 0:
                BotForumHelper.a(this.f16713b, this.f16714c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f16713b, this.f16714c, this.d, this.e);
                return;
        }
    }
}
