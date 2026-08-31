package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f19106a;
    public final BotForumHelper f19107b;
    public final long f19108c;
    public final int d;
    public final long f19109e;

    public k0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f19106a = i11;
        this.f19107b = botForumHelper;
        this.f19108c = j10;
        this.d = i10;
        this.f19109e = j11;
    }

    @Override
    public final void run() {
        switch (this.f19106a) {
            case 0:
                BotForumHelper.a(this.f19107b, this.f19108c, this.d, this.f19109e);
                return;
            default:
                BotForumHelper.d(this.f19107b, this.f19108c, this.d, this.f19109e);
                return;
        }
    }
}
