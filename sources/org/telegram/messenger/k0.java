package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f18310a;
    public final BotForumHelper f18311b;
    public final long f18312c;
    public final int d;
    public final long f18313e;

    public k0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f18310a = i11;
        this.f18311b = botForumHelper;
        this.f18312c = j3;
        this.d = i10;
        this.f18313e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18310a) {
            case 0:
                BotForumHelper.a(this.f18311b, this.f18312c, this.d, this.f18313e);
                return;
            default:
                BotForumHelper.d(this.f18311b, this.f18312c, this.d, this.f18313e);
                return;
        }
    }
}
