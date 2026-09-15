package org.telegram.messenger;
public final class j0 implements Runnable {
    public final int f16443a;
    public final BotForumHelper f16444b;
    public final long f16445c;
    public final int d;
    public final long e;

    public j0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f16443a = i11;
        this.f16444b = botForumHelper;
        this.f16445c = j3;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16443a) {
            case 0:
                BotForumHelper.a(this.f16444b, this.f16445c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f16444b, this.f16445c, this.d, this.e);
                return;
        }
    }
}
