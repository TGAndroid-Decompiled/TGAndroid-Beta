package org.telegram.messenger;
public final class l0 implements Runnable {
    public final int f18238a;
    public final long f18239b;
    public final long f18240c;
    public final long d;
    public final Object f18241e;

    public l0(long j3, long j10, long j11, org.telegram.ui.b5 b5Var) {
        this.f18238a = 2;
        this.f18239b = j3;
        this.f18240c = j10;
        this.d = j11;
        this.f18241e = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f18238a) {
            case 0:
                ((BotGuardHelper) this.f18241e).lambda$openGuardBotWebApp$0(this.f18239b, this.f18240c, this.d);
                return;
            case 1:
                ((MediaDataController) this.f18241e).lambda$loadMusic$142(this.f18239b, this.f18240c, this.d);
                return;
            default:
                long j3 = this.f18239b;
                long j10 = this.f18240c;
                org.telegram.ui.z6.f43301n0 = Long.valueOf(j3 * j10);
                Long valueOf = Long.valueOf(this.d * j10);
                org.telegram.ui.z6.f43302o0 = valueOf;
                ((org.telegram.ui.b5) this.f18241e).run(org.telegram.ui.z6.f43301n0, valueOf);
                return;
        }
    }

    public l0(BaseController baseController, long j3, long j10, long j11, int i10) {
        this.f18238a = i10;
        this.f18241e = baseController;
        this.f18239b = j3;
        this.f18240c = j10;
        this.d = j11;
    }
}
