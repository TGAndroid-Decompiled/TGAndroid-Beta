package org.telegram.messenger.voip;
public final class a0 implements Runnable {
    public final int f19524a;
    public final VoIPService f19525b;
    public final int f19526c;

    public a0(VoIPService voIPService, int i10, int i11) {
        this.f19524a = i11;
        this.f19525b = voIPService;
        this.f19526c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19524a) {
            case 0:
                VoIPService.u1(this.f19525b, this.f19526c);
                return;
            case 1:
                VoIPService.K0(this.f19525b, this.f19526c);
                return;
            case 2:
                VoIPService.q0(this.f19525b, this.f19526c);
                return;
            case 3:
                VoIPService.U(this.f19525b, this.f19526c);
                return;
            case 4:
                VoIPService.k1(this.f19525b, this.f19526c);
                return;
            case 5:
                VoIPService.t0(this.f19525b, this.f19526c);
                return;
            default:
                VoIPService.A0(this.f19525b, this.f19526c);
                return;
        }
    }
}
