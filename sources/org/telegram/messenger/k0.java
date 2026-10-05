package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f18313a;
    public final BotForumHelper f18314b;
    public final long f18315c;
    public final int d;
    public final long f18316e;

    public k0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f18313a = i11;
        this.f18314b = botForumHelper;
        this.f18315c = j3;
        this.d = i10;
        this.f18316e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18313a) {
            case 0:
                BotForumHelper.a(this.f18314b, this.f18315c, this.d, this.f18316e);
                return;
            default:
                BotForumHelper.d(this.f18314b, this.f18315c, this.d, this.f18316e);
                return;
        }
    }
}
