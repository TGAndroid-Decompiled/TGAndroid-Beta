package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f19534a;
    public final VoIPService f19535b;
    public final int f19536c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f19534a = i11;
        this.f19535b = voIPService;
        this.f19536c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19534a) {
            case 0:
                VoIPService.u1(this.f19535b, this.f19536c);
                return;
            case 1:
                VoIPService.K0(this.f19535b, this.f19536c);
                return;
            case 2:
                VoIPService.q0(this.f19535b, this.f19536c);
                return;
            case 3:
                VoIPService.U(this.f19535b, this.f19536c);
                return;
            case 4:
                VoIPService.k1(this.f19535b, this.f19536c);
                return;
            case 5:
                VoIPService.t0(this.f19535b, this.f19536c);
                return;
            default:
                VoIPService.A0(this.f19535b, this.f19536c);
                return;
        }
    }
}
