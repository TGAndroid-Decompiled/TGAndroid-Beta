package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f18775a;
    public final VoIPService f18776b;
    public final int f18777c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f18775a = i11;
        this.f18776b = voIPService;
        this.f18777c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18775a) {
            case 0:
                VoIPService.u1(this.f18776b, this.f18777c);
                return;
            case 1:
                VoIPService.K0(this.f18776b, this.f18777c);
                return;
            case 2:
                VoIPService.q0(this.f18776b, this.f18777c);
                return;
            case 3:
                VoIPService.U(this.f18776b, this.f18777c);
                return;
            case 4:
                VoIPService.k1(this.f18776b, this.f18777c);
                return;
            case 5:
                VoIPService.t0(this.f18776b, this.f18777c);
                return;
            default:
                VoIPService.A0(this.f18776b, this.f18777c);
                return;
        }
    }
}
