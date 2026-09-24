package org.telegram.messenger;
public final class k0 implements Runnable {
    public final int f16763a;
    public final BotForumHelper f16764b;
    public final long f16765c;
    public final int d;
    public final long e;

    public k0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f16763a = i11;
        this.f16764b = botForumHelper;
        this.f16765c = j3;
        this.d = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16763a) {
            case 0:
                BotForumHelper.a(this.f16764b, this.f16765c, this.d, this.e);
                return;
            default:
                BotForumHelper.d(this.f16764b, this.f16765c, this.d, this.e);
                return;
        }
    }
}
