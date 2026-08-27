package org.telegram.messenger;

public final class l0 implements Runnable {

    public final int f20816a;

    public final long f20817b;

    public final long f20818c;
    public final long d;

    public final Object f20819e;

    public l0(long j10, long j11, long j12, org.telegram.ui.b5 b5Var) {
        this.f20816a = 2;
        this.f20817b = j10;
        this.f20818c = j11;
        this.d = j12;
        this.f20819e = b5Var;
    }

    @Override
    public final void run() {
        switch (this.f20816a) {
            case 0:
                ((BotGuardHelper) this.f20819e).lambda$openGuardBotWebApp$0(this.f20817b, this.f20818c, this.d);
                break;
            case 1:
                ((MediaDataController) this.f20819e).lambda$loadMusic$142(this.f20817b, this.f20818c, this.d);
                break;
            default:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f20819e;
                long j10 = this.f20817b;
                long j11 = this.f20818c;
                org.telegram.ui.z6.f45035j0 = Long.valueOf(j10 * j11);
                Long lValueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.z6.f45036k0 = lValueOf;
                b5Var.run(org.telegram.ui.z6.f45035j0, lValueOf);
                break;
        }
    }

    public l0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f20816a = i10;
        this.f20819e = baseController;
        this.f20817b = j10;
        this.f20818c = j11;
        this.d = j12;
    }
}
