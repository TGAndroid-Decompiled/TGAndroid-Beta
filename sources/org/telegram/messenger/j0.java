package org.telegram.messenger;
public final class j0 implements Runnable {
    public final int f20615a;
    public final BotForumHelper f20616b;
    public final long f20617c;
    public final int d;
    public final long f20618e;

    public j0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f20615a = i11;
        this.f20616b = botForumHelper;
        this.f20617c = j10;
        this.d = i10;
        this.f20618e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20615a) {
            case 0:
                BotForumHelper.a(this.f20616b, this.f20617c, this.d, this.f20618e);
                return;
            default:
                BotForumHelper.d(this.f20616b, this.f20617c, this.d, this.f20618e);
                return;
        }
    }
}
