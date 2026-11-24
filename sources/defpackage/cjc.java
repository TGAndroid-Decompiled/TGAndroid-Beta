package defpackage;

import org.telegram.messenger.voip.VoIPService;
public final class cjc implements Runnable {
    public final byte a;
    public final VoIPService b;

    public cjc(VoIPService voIPService, byte b) {
        this.a = b;
        this.b = voIPService;
    }

    @Override
    public final void run() {
        byte b = this.a;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                VoIPService.w0(voIPService);
                return;
            case 1:
                VoIPService.N0(voIPService);
                return;
            case 2:
                VoIPService.d(voIPService);
                return;
            case 3:
                VoIPService.t1(voIPService);
                return;
            case 4:
                VoIPService.i(voIPService);
                return;
            case 5:
                VoIPService.K0(voIPService);
                return;
            case 6:
                VoIPService.d0(voIPService);
                return;
            case 7:
                VoIPService.j(voIPService);
                return;
            case 8:
                VoIPService.p(voIPService);
                return;
            case 9:
                VoIPService.R(voIPService);
                return;
            case 10:
                VoIPService.k0(voIPService);
                return;
            case 11:
                VoIPService.M0(voIPService);
                return;
            case 12:
                VoIPService.D(voIPService);
                return;
            case 13:
                VoIPService.U0(voIPService);
                return;
            case 14:
                VoIPService.v0(voIPService);
                return;
            case 15:
                VoIPService.b(voIPService);
                return;
            case 16:
                VoIPService.E0(voIPService);
                return;
            case 17:
                VoIPService.Y0(voIPService);
                return;
            case 18:
                VoIPService.c1(voIPService);
                return;
            case 19:
                VoIPService.D0(voIPService);
                return;
            case 20:
                VoIPService.n1(voIPService);
                return;
            case 21:
                VoIPService.O0(voIPService);
                return;
            case 22:
                VoIPService.a0(voIPService);
                return;
            case 23:
                VoIPService.m0(voIPService);
                return;
            case 24:
                VoIPService.w(voIPService);
                return;
            case 25:
                VoIPService.o0(voIPService);
                return;
            case 26:
                VoIPService.P(voIPService);
                return;
            case 27:
                VoIPService.P0(voIPService);
                return;
            case 28:
                VoIPService.p1(voIPService);
                return;
            default:
                VoIPService.h0(voIPService);
                return;
        }
    }
}
