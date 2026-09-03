package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f19108a;
    public final BotForumHelper f19109b;
    public final long f19110c;
    public final int d;
    public final long f19111e;

    public k0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f19108a = i11;
        this.f19109b = botForumHelper;
        this.f19110c = j10;
        this.d = i10;
        this.f19111e = j11;
    }

    @Override
    public final void run() {
        switch (this.f19108a) {
            case 0:
                BotForumHelper.a(this.f19109b, this.f19110c, this.d, this.f19111e);
                return;
            default:
                BotForumHelper.d(this.f19109b, this.f19110c, this.d, this.f19111e);
                return;
        }
    }
}
