package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f19370a;
    public final VoIPService f19371b;
    public final int f19372c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f19370a = i11;
        this.f19371b = voIPService;
        this.f19372c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19370a) {
            case 0:
                VoIPService.W(this.f19371b, this.f19372c);
                return;
            case 1:
                VoIPService.q0(this.f19371b, this.f19372c);
                return;
            case 2:
                VoIPService.O0(this.f19371b, this.f19372c);
                return;
            case 3:
                VoIPService.R(this.f19371b, this.f19372c);
                return;
            case 4:
                VoIPService.j1(this.f19371b, this.f19372c);
                return;
            case 5:
                VoIPService.t0(this.f19371b, this.f19372c);
                return;
            default:
                VoIPService.z0(this.f19371b, this.f19372c);
                return;
        }
    }
}
