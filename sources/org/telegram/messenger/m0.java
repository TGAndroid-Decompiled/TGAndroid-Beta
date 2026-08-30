package org.telegram.messenger;
public final class m0 implements Runnable {
    public final int f17802a;
    public final long f17803b;
    public final long f17804c;
    public final long d;
    public final Object e;

    public m0(long j10, long j11, long j12, org.telegram.ui.d5 d5Var) {
        this.f17802a = 2;
        this.f17803b = j10;
        this.f17804c = j11;
        this.d = j12;
        this.e = d5Var;
    }

    @Override
    public final void run() {
        switch (this.f17802a) {
            case 0:
                ((BotGuardHelper) this.e).lambda$openGuardBotWebApp$0(this.f17803b, this.f17804c, this.d);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$loadMusic$142(this.f17803b, this.f17804c, this.d);
                return;
            default:
                long j10 = this.f17803b;
                long j11 = this.f17804c;
                org.telegram.ui.b7.f32809k0 = Long.valueOf(j10 * j11);
                Long valueOf = Long.valueOf(this.d * j11);
                org.telegram.ui.b7.f32810l0 = valueOf;
                ((org.telegram.ui.d5) this.e).run(org.telegram.ui.b7.f32809k0, valueOf);
                return;
        }
    }

    public m0(BaseController baseController, long j10, long j11, long j12, int i10) {
        this.f17802a = i10;
        this.e = baseController;
        this.f17803b = j10;
        this.f17804c = j11;
        this.d = j12;
    }
}
