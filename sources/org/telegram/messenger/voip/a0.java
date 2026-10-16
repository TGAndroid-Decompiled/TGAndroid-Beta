package org.telegram.messenger.voip;
public final class a0 implements Runnable {
    public final int f18467a;
    public final VoIPService f18468b;
    public final int f18469c;

    public a0(VoIPService voIPService, int i10, int i11) {
        this.f18467a = i11;
        this.f18468b = voIPService;
        this.f18469c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18467a) {
            case 0:
                VoIPService.u1(this.f18468b, this.f18469c);
                return;
            case 1:
                VoIPService.K0(this.f18468b, this.f18469c);
                return;
            case 2:
                VoIPService.q0(this.f18468b, this.f18469c);
                return;
            case 3:
                VoIPService.U(this.f18468b, this.f18469c);
                return;
            case 4:
                VoIPService.k1(this.f18468b, this.f18469c);
                return;
            case 5:
                VoIPService.t0(this.f18468b, this.f18469c);
                return;
            default:
                VoIPService.A0(this.f18468b, this.f18469c);
                return;
        }
    }
}
