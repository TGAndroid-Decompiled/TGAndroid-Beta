package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f18116a;
    public final BotForumHelper f18117b;
    public final long f18118c;
    public final int d;
    public final long f18119e;

    public l0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f18116a = i11;
        this.f18117b = botForumHelper;
        this.f18118c = j3;
        this.d = i10;
        this.f18119e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18116a) {
            case 0:
                BotForumHelper.a(this.f18117b, this.f18118c, this.d, this.f18119e);
                return;
            default:
                BotForumHelper.d(this.f18117b, this.f18118c, this.d, this.f18119e);
                return;
        }
    }
}
