package org.telegram.messenger.voip;
public final class q implements Runnable {
    public final int f21669a;
    public final VoIPService f21670b;

    public q(VoIPService voIPService, int i10) {
        this.f21669a = i10;
        this.f21670b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f21669a) {
            case 0:
                VoIPService.J0(this.f21670b);
                return;
            case 1:
                VoIPService.X0(this.f21670b);
                return;
            case 2:
                VoIPService.v0(this.f21670b);
                return;
            case 3:
                VoIPService.J(this.f21670b);
                return;
            case 4:
                VoIPService.T(this.f21670b);
                return;
            case 5:
                VoIPService.B0(this.f21670b);
                return;
            case 6:
                VoIPService.z(this.f21670b);
                return;
            case 7:
                VoIPService.H0(this.f21670b);
                return;
            case 8:
                VoIPService.v1(this.f21670b);
                return;
            case 9:
                VoIPService.B(this.f21670b);
                return;
            case 10:
                VoIPService.e(this.f21670b);
                return;
            case 11:
                VoIPService.w1(this.f21670b);
                return;
            case 12:
                VoIPService.I(this.f21670b);
                return;
            case 13:
                VoIPService.j1(this.f21670b);
                return;
            case 14:
                VoIPService.E(this.f21670b);
                return;
            case 15:
                VoIPService.Q0(this.f21670b);
                return;
            case 16:
                VoIPService.b0(this.f21670b);
                return;
            case 17:
                VoIPService.z0(this.f21670b);
                return;
            case 18:
                VoIPService.t(this.f21670b);
                return;
            case 19:
                VoIPService.u(this.f21670b);
                return;
            case 20:
                VoIPService.c1(this.f21670b);
                return;
            case 21:
                VoIPService.e1(this.f21670b);
                return;
            case 22:
                VoIPService.O0(this.f21670b);
                return;
            case 23:
                VoIPService.n1(this.f21670b);
                return;
            case 24:
                VoIPService.w(this.f21670b);
                return;
            case 25:
                VoIPService.r(this.f21670b);
                return;
            case 26:
                VoIPService.P0(this.f21670b);
                return;
            case 27:
                VoIPService.i1(this.f21670b);
                return;
            case 28:
                VoIPService.c(this.f21670b);
                return;
            default:
                VoIPService.b1(this.f21670b);
                return;
        }
    }
}
