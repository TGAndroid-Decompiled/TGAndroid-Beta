package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f20387a;
    public final VoIPService f20388b;
    public final int f20389c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f20387a = i11;
        this.f20388b = voIPService;
        this.f20389c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20387a) {
            case 0:
                VoIPService.W(this.f20388b, this.f20389c);
                return;
            case 1:
                VoIPService.q0(this.f20388b, this.f20389c);
                return;
            case 2:
                VoIPService.O0(this.f20388b, this.f20389c);
                return;
            case 3:
                VoIPService.R(this.f20388b, this.f20389c);
                return;
            case 4:
                VoIPService.j1(this.f20388b, this.f20389c);
                return;
            case 5:
                VoIPService.t0(this.f20388b, this.f20389c);
                return;
            default:
                VoIPService.z0(this.f20388b, this.f20389c);
                return;
        }
    }
}
