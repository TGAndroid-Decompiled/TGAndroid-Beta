package org.telegram.messenger.voip;
public final class r implements Runnable {
    public final int f19988a;
    public final VoIPService f19989b;

    public r(VoIPService voIPService, int i10) {
        this.f19988a = i10;
        this.f19989b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19988a) {
            case 0:
                VoIPService.J0(this.f19989b);
                return;
            case 1:
                VoIPService.X0(this.f19989b);
                return;
            case 2:
                VoIPService.v0(this.f19989b);
                return;
            case 3:
                VoIPService.J(this.f19989b);
                return;
            case 4:
                VoIPService.T(this.f19989b);
                return;
            case 5:
                VoIPService.B0(this.f19989b);
                return;
            case 6:
                VoIPService.z(this.f19989b);
                return;
            case 7:
                VoIPService.H0(this.f19989b);
                return;
            case 8:
                VoIPService.v1(this.f19989b);
                return;
            case 9:
                VoIPService.B(this.f19989b);
                return;
            case 10:
                VoIPService.e(this.f19989b);
                return;
            case 11:
                VoIPService.w1(this.f19989b);
                return;
            case 12:
                VoIPService.I(this.f19989b);
                return;
            case 13:
                VoIPService.j1(this.f19989b);
                return;
            case 14:
                VoIPService.E(this.f19989b);
                return;
            case 15:
                VoIPService.Q0(this.f19989b);
                return;
            case 16:
                VoIPService.b0(this.f19989b);
                return;
            case 17:
                VoIPService.z0(this.f19989b);
                return;
            case 18:
                VoIPService.t(this.f19989b);
                return;
            case 19:
                VoIPService.u(this.f19989b);
                return;
            case 20:
                VoIPService.c1(this.f19989b);
                return;
            case 21:
                VoIPService.e1(this.f19989b);
                return;
            case 22:
                VoIPService.O0(this.f19989b);
                return;
            case 23:
                VoIPService.n1(this.f19989b);
                return;
            case 24:
                VoIPService.w(this.f19989b);
                return;
            case 25:
                VoIPService.r(this.f19989b);
                return;
            case 26:
                VoIPService.P0(this.f19989b);
                return;
            case 27:
                VoIPService.i1(this.f19989b);
                return;
            case 28:
                VoIPService.c(this.f19989b);
                return;
            default:
                VoIPService.b1(this.f19989b);
                return;
        }
    }
}
