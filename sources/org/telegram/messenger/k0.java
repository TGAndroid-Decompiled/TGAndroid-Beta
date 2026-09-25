package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f16778a;
    public final BotForumHelper f16779b;
    public final long f16780c;
    public final int d;
    public final long e;

    public k0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f16778a = i11;
        this.f16779b = botForumHelper;
        this.f16780c = j3;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16778a) {
            case 0:
                BotForumHelper.a(this.f16779b, this.f16780c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f16779b, this.f16780c, this.d, this.e);
                return;
        }
    }
}
