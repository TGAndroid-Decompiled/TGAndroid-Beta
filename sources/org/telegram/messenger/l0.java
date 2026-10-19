package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f18830a;
    public final BotForumHelper f18831b;
    public final long f18832c;
    public final int d;
    public final long e;

    public l0(BotForumHelper botForumHelper, long j10, int i10, long j11, int i11) {
        this.f18830a = i11;
        this.f18831b = botForumHelper;
        this.f18832c = j10;
        this.d = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18830a) {
            case 0:
                BotForumHelper.a(this.f18831b, this.f18832c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f18831b, this.f18832c, this.d, this.e);
                return;
        }
    }
}
