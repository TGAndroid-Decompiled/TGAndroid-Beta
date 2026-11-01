package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f18779a;
    public final VoIPService f18780b;
    public final int f18781c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f18779a = i11;
        this.f18780b = voIPService;
        this.f18781c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18779a) {
            case 0:
                VoIPService.u1(this.f18780b, this.f18781c);
                return;
            case 1:
                VoIPService.K0(this.f18780b, this.f18781c);
                return;
            case 2:
                VoIPService.q0(this.f18780b, this.f18781c);
                return;
            case 3:
                VoIPService.U(this.f18780b, this.f18781c);
                return;
            case 4:
                VoIPService.k1(this.f18780b, this.f18781c);
                return;
            case 5:
                VoIPService.t0(this.f18780b, this.f18781c);
                return;
            default:
                VoIPService.A0(this.f18780b, this.f18781c);
                return;
        }
    }
}
