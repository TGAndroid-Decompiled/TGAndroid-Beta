package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f18759a;
    public final VoIPService f18760b;
    public final int f18761c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f18759a = i11;
        this.f18760b = voIPService;
        this.f18761c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18759a) {
            case 0:
                VoIPService.W(this.f18760b, this.f18761c);
                return;
            case 1:
                VoIPService.q0(this.f18760b, this.f18761c);
                return;
            case 2:
                VoIPService.O0(this.f18760b, this.f18761c);
                return;
            case 3:
                VoIPService.R(this.f18760b, this.f18761c);
                return;
            case 4:
                VoIPService.j1(this.f18760b, this.f18761c);
                return;
            case 5:
                VoIPService.t0(this.f18760b, this.f18761c);
                return;
            default:
                VoIPService.z0(this.f18760b, this.f18761c);
                return;
        }
    }
}
