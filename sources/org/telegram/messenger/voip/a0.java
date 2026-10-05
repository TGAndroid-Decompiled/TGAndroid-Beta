package org.telegram.messenger.voip;
public final class a0 implements Runnable {
    public final int f19519a;
    public final VoIPService f19520b;
    public final int f19521c;

    public a0(VoIPService voIPService, int i10, int i11) {
        this.f19519a = i11;
        this.f19520b = voIPService;
        this.f19521c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19519a) {
            case 0:
                VoIPService.u1(this.f19520b, this.f19521c);
                return;
            case 1:
                VoIPService.K0(this.f19520b, this.f19521c);
                return;
            case 2:
                VoIPService.q0(this.f19520b, this.f19521c);
                return;
            case 3:
                VoIPService.U(this.f19520b, this.f19521c);
                return;
            case 4:
                VoIPService.k1(this.f19520b, this.f19521c);
                return;
            case 5:
                VoIPService.t0(this.f19520b, this.f19521c);
                return;
            default:
                VoIPService.A0(this.f19520b, this.f19521c);
                return;
        }
    }
}
