package org.telegram.messenger;
public final class j0 implements Runnable {
    public final int f16427a;
    public final BotForumHelper f16428b;
    public final long f16429c;
    public final int d;
    public final long e;

    public j0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f16427a = i11;
        this.f16428b = botForumHelper;
        this.f16429c = j3;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16427a) {
            case 0:
                BotForumHelper.a(this.f16428b, this.f16429c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f16428b, this.f16429c, this.d, this.e);
                return;
        }
    }
}
