package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f18827a;
    public final BotForumHelper f18828b;
    public final long f18829c;
    public final int d;
    public final long e;

    public l0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f18827a = i11;
        this.f18828b = botForumHelper;
        this.f18829c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18827a) {
            case 0:
                BotForumHelper.a(this.f18828b, this.f18829c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f18828b, this.f18829c, this.d, this.e);
                return;
        }
    }
}
