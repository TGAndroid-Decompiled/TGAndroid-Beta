package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f18312a;
    public final BotForumHelper f18313b;
    public final long f18314c;
    public final int d;
    public final long f18315e;

    public k0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f18312a = i11;
        this.f18313b = botForumHelper;
        this.f18314c = j3;
        this.d = i10;
        this.f18315e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18312a) {
            case 0:
                BotForumHelper.a(this.f18313b, this.f18314c, this.d, this.f18315e);
                return;
            default:
                BotForumHelper.d(this.f18313b, this.f18314c, this.d, this.f18315e);
                return;
        }
    }
}
