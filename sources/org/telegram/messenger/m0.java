package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f15740a;
    public final long f15741b;
    public final long f15742c;
    public final long d;
    public final Object e;

    public m0(long j3, long j10, long j11, org.telegram.ui.b5 b5Var) {
        this.f15740a = 2;
        this.f15741b = j3;
        this.f15742c = j10;
        this.d = j11;
        this.e = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f15740a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f15741b, this.f15742c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f15741b, this.f15742c, this.d);
                return;
            default:
                long j3 = this.f15741b;
                long j10 = this.f15742c;
                org.telegram.ui.y6.f38905n0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.y6.f38906o0 = valueOf;
                ((org.telegram.ui.b5) this.e).run(org.telegram.ui.y6.f38905n0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f15740a = i10;
        this.e = baseController;
        this.f15741b = j3;
        this.f15742c = j10;
        this.d = j11;
    }
}
