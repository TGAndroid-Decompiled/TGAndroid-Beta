package org.telegram.messenger.voip;
public final class a0 implements Runnable {
    public final int f19301a;
    public final VoIPService f19302b;
    public final int f19303c;

    public a0(VoIPService voIPService, int i10, int i11) {
        this.f19301a = i11;
        this.f19302b = voIPService;
        this.f19303c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19301a) {
            case 0:
                VoIPService.u1(this.f19302b, this.f19303c);
                return;
            case 1:
                VoIPService.K0(this.f19302b, this.f19303c);
                return;
            case 2:
                VoIPService.q0(this.f19302b, this.f19303c);
                return;
            case 3:
                VoIPService.U(this.f19302b, this.f19303c);
                return;
            case 4:
                VoIPService.k1(this.f19302b, this.f19303c);
                return;
            case 5:
                VoIPService.t0(this.f19302b, this.f19303c);
                return;
            default:
                VoIPService.A0(this.f19302b, this.f19303c);
                return;
        }
    }
}
