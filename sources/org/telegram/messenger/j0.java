package org.telegram.messenger;
public final class j0 implements Runnable {
    public final int f16452a;
    public final BotForumHelper f16453b;
    public final long f16454c;
    public final int d;
    public final long e;

    public j0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f16452a = i11;
        this.f16453b = botForumHelper;
        this.f16454c = j3;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16452a) {
            case 0:
                BotForumHelper.a(this.f16453b, this.f16454c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f16453b, this.f16454c, this.d, this.e);
                return;
        }
    }
}
