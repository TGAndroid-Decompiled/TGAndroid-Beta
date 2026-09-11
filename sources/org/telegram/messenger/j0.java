package org.telegram.messenger;
public final class j0 implements Runnable {
    public final int f18030a;
    public final BotForumHelper f18031b;
    public final long f18032c;
    public final int d;
    public final long f18033e;

    public j0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f18030a = i11;
        this.f18031b = botForumHelper;
        this.f18032c = j3;
        this.d = i10;
        this.f18033e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18030a) {
            case 0:
                BotForumHelper.a(this.f18031b, this.f18032c, this.d, this.f18033e);
                return;
            default:
                BotForumHelper.d(this.f18031b, this.f18032c, this.d, this.f18033e);
                return;
        }
    }
}
