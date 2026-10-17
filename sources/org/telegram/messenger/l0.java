package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f18826a;
    public final BotForumHelper f18827b;
    public final long f18828c;
    public final int d;
    public final long e;

    public l0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f18826a = i11;
        this.f18827b = botForumHelper;
        this.f18828c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18826a) {
            case 0:
                BotForumHelper.a(this.f18827b, this.f18828c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f18827b, this.f18828c, this.d, this.e);
                return;
        }
    }
}
