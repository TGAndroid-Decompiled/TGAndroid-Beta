package org.telegram.messenger;
public final class j0 implements Runnable {
    public final int f16440a;
    public final BotForumHelper f16441b;
    public final long f16442c;
    public final int d;
    public final long e;

    public j0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f16440a = i11;
        this.f16441b = botForumHelper;
        this.f16442c = j3;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16440a) {
            case 0:
                BotForumHelper.a(this.f16441b, this.f16442c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f16441b, this.f16442c, this.d, this.e);
                return;
        }
    }
}
