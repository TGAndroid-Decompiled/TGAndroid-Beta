package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f18346a;
    public final BotForumHelper f18347b;
    public final long f18348c;
    public final int d;
    public final long f18349e;

    public k0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f18346a = i11;
        this.f18347b = botForumHelper;
        this.f18348c = j3;
        this.d = i10;
        this.f18349e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18346a) {
            case 0:
                BotForumHelper.a(this.f18347b, this.f18348c, this.d, this.f18349e);
                return;
            default:
                BotForumHelper.d(this.f18347b, this.f18348c, this.d, this.f18349e);
                return;
        }
    }
}
