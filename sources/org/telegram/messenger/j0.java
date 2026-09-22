package org.telegram.messenger;
public final class j0 implements Runnable {
    public final int f16689a;
    public final BotForumHelper f16690b;
    public final long f16691c;
    public final int d;
    public final long e;

    public j0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f16689a = i11;
        this.f16690b = botForumHelper;
        this.f16691c = j3;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16689a) {
            case 0:
                BotForumHelper.a(this.f16690b, this.f16691c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f16690b, this.f16691c, this.d, this.e);
                return;
        }
    }
}
