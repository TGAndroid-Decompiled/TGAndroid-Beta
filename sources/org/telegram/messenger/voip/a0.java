package org.telegram.messenger.voip;
public final class a0 implements Runnable {
    public final int f19300a;
    public final VoIPService f19301b;
    public final int f19302c;

    public a0(VoIPService voIPService, int i10, int i11) {
        this.f19300a = i11;
        this.f19301b = voIPService;
        this.f19302c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19300a) {
            case 0:
                VoIPService.u1(this.f19301b, this.f19302c);
                return;
            case 1:
                VoIPService.K0(this.f19301b, this.f19302c);
                return;
            case 2:
                VoIPService.q0(this.f19301b, this.f19302c);
                return;
            case 3:
                VoIPService.U(this.f19301b, this.f19302c);
                return;
            case 4:
                VoIPService.k1(this.f19301b, this.f19302c);
                return;
            case 5:
                VoIPService.t0(this.f19301b, this.f19302c);
                return;
            default:
                VoIPService.A0(this.f19301b, this.f19302c);
                return;
        }
    }
}
