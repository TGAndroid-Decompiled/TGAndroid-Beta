package org.telegram.messenger.voip;
public final class a0 implements Runnable {
    public final int f19521a;
    public final VoIPService f19522b;
    public final int f19523c;

    public a0(VoIPService voIPService, int i10, int i11) {
        this.f19521a = i11;
        this.f19522b = voIPService;
        this.f19523c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19521a) {
            case 0:
                VoIPService.u1(this.f19522b, this.f19523c);
                return;
            case 1:
                VoIPService.K0(this.f19522b, this.f19523c);
                return;
            case 2:
                VoIPService.q0(this.f19522b, this.f19523c);
                return;
            case 3:
                VoIPService.U(this.f19522b, this.f19523c);
                return;
            case 4:
                VoIPService.k1(this.f19522b, this.f19523c);
                return;
            case 5:
                VoIPService.t0(this.f19522b, this.f19523c);
                return;
            default:
                VoIPService.A0(this.f19522b, this.f19523c);
                return;
        }
    }
}
