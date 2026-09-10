package org.telegram.messenger.voip;
public final class w implements Runnable {
    public final int f16797a;
    public final VoIPService f16798b;

    public w(VoIPService voIPService, int i10) {
        this.f16797a = i10;
        this.f16798b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f16797a) {
            case 0:
                VoIPService.V0(this.f16798b);
                return;
            case 1:
                VoIPService.A0(this.f16798b);
                return;
            case 2:
                VoIPService.Q(this.f16798b);
                return;
            case 3:
                VoIPService.P(this.f16798b);
                return;
            case 4:
                VoIPService.g1(this.f16798b);
                return;
            case 5:
                VoIPService.B0(this.f16798b);
                return;
            case 6:
                VoIPService.m(this.f16798b);
                return;
            case 7:
                VoIPService.I0(this.f16798b);
                return;
            case 8:
                VoIPService.u1(this.f16798b);
                return;
            case 9:
                VoIPService.y(this.f16798b);
                return;
            case 10:
                VoIPService.v1(this.f16798b);
                return;
            case 11:
                VoIPService.F(this.f16798b);
                return;
            case 12:
                VoIPService.i1(this.f16798b);
                return;
            case 13:
                VoIPService.B(this.f16798b);
                return;
            case 14:
                VoIPService.Z(this.f16798b);
                return;
            case 15:
                VoIPService.k0(this.f16798b);
                return;
            case 16:
                VoIPService.F0(this.f16798b);
                return;
            case 17:
                VoIPService.b(this.f16798b);
                return;
            case 18:
                VoIPService.y0(this.f16798b);
                return;
            case 19:
                VoIPService.s(this.f16798b);
                return;
            case 20:
                VoIPService.c1(this.f16798b);
                return;
            case 21:
                VoIPService.Z0(this.f16798b);
                return;
            case 22:
                VoIPService.b1(this.f16798b);
                return;
            case 23:
                VoIPService.P0(this.f16798b);
                return;
            case 24:
                VoIPService.m1(this.f16798b);
                return;
            case 25:
                VoIPService.u(this.f16798b);
                return;
            case 26:
                VoIPService.q(this.f16798b);
                return;
            case 27:
                VoIPService.Q0(this.f16798b);
                return;
            case 28:
                VoIPService.h1(this.f16798b);
                return;
            default:
                VoIPService.Y0(this.f16798b);
                return;
        }
    }
}
