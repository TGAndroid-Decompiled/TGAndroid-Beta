package org.telegram.messenger;
public final class j0 implements Runnable {
    public final int f15481a;
    public final BotForumHelper f15482b;
    public final long f15483c;
    public final int d;
    public final long e;

    public j0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f15481a = i11;
        this.f15482b = botForumHelper;
        this.f15483c = j3;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f15481a) {
            case 0:
                BotForumHelper.a(this.f15482b, this.f15483c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f15482b, this.f15483c, this.d, this.e);
                return;
        }
    }
}
