package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f19530a;
    public final VoIPService f19531b;
    public final int f19532c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f19530a = i11;
        this.f19531b = voIPService;
        this.f19532c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19530a) {
            case 0:
                VoIPService.u1(this.f19531b, this.f19532c);
                return;
            case 1:
                VoIPService.K0(this.f19531b, this.f19532c);
                return;
            case 2:
                VoIPService.q0(this.f19531b, this.f19532c);
                return;
            case 3:
                VoIPService.U(this.f19531b, this.f19532c);
                return;
            case 4:
                VoIPService.k1(this.f19531b, this.f19532c);
                return;
            case 5:
                VoIPService.t0(this.f19531b, this.f19532c);
                return;
            default:
                VoIPService.A0(this.f19531b, this.f19532c);
                return;
        }
    }
}
