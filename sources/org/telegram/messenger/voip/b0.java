package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f19343a;
    public final VoIPService f19344b;
    public final int f19345c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f19343a = i11;
        this.f19344b = voIPService;
        this.f19345c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19343a) {
            case 0:
                VoIPService.W(this.f19344b, this.f19345c);
                return;
            case 1:
                VoIPService.q0(this.f19344b, this.f19345c);
                return;
            case 2:
                VoIPService.O0(this.f19344b, this.f19345c);
                return;
            case 3:
                VoIPService.R(this.f19344b, this.f19345c);
                return;
            case 4:
                VoIPService.j1(this.f19344b, this.f19345c);
                return;
            case 5:
                VoIPService.t0(this.f19344b, this.f19345c);
                return;
            default:
                VoIPService.z0(this.f19344b, this.f19345c);
                return;
        }
    }
}
