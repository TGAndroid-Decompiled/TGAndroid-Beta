package org.telegram.messenger;
public final class j0 implements Runnable {
    public final int f16684a;
    public final BotForumHelper f16685b;
    public final long f16686c;
    public final int d;
    public final long e;

    public j0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f16684a = i11;
        this.f16685b = botForumHelper;
        this.f16686c = j3;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16684a) {
            case 0:
                BotForumHelper.a(this.f16685b, this.f16686c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f16685b, this.f16686c, this.d, this.e);
                return;
        }
    }
}
