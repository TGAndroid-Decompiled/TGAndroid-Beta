package org.telegram.messenger;
public final class j0 implements Runnable {
    public final int f18012a;
    public final BotForumHelper f18013b;
    public final long f18014c;
    public final int d;
    public final long f18015e;

    public j0(BotForumHelper botForumHelper, long j3, int i10, long j10, int i11) {
        this.f18012a = i11;
        this.f18013b = botForumHelper;
        this.f18014c = j3;
        this.d = i10;
        this.f18015e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18012a) {
            case 0:
                BotForumHelper.a(this.f18013b, this.f18014c, this.d, this.f18015e);
                return;
            default:
                BotForumHelper.d(this.f18013b, this.f18014c, this.d, this.f18015e);
                return;
        }
    }
}
