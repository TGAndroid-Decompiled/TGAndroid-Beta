package org.telegram.messenger.voip;
public final class a0 implements Runnable {
    public final int f19522a;
    public final VoIPService f19523b;
    public final int f19524c;

    public a0(VoIPService voIPService, int i10, int i11) {
        this.f19522a = i11;
        this.f19523b = voIPService;
        this.f19524c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19522a) {
            case 0:
                VoIPService.u1(this.f19523b, this.f19524c);
                return;
            case 1:
                VoIPService.K0(this.f19523b, this.f19524c);
                return;
            case 2:
                VoIPService.q0(this.f19523b, this.f19524c);
                return;
            case 3:
                VoIPService.U(this.f19523b, this.f19524c);
                return;
            case 4:
                VoIPService.k1(this.f19523b, this.f19524c);
                return;
            case 5:
                VoIPService.t0(this.f19523b, this.f19524c);
                return;
            default:
                VoIPService.A0(this.f19523b, this.f19524c);
                return;
        }
    }
}
