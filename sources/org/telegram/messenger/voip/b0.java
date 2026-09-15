package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f17626a;
    public final VoIPService f17627b;
    public final int f17628c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f17626a = i11;
        this.f17627b = voIPService;
        this.f17628c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17626a) {
            case 0:
                VoIPService.W(this.f17627b, this.f17628c);
                return;
            case 1:
                VoIPService.q0(this.f17627b, this.f17628c);
                return;
            case 2:
                VoIPService.O0(this.f17627b, this.f17628c);
                return;
            case 3:
                VoIPService.R(this.f17627b, this.f17628c);
                return;
            case 4:
                VoIPService.j1(this.f17627b, this.f17628c);
                return;
            case 5:
                VoIPService.t0(this.f17627b, this.f17628c);
                return;
            default:
                VoIPService.z0(this.f17627b, this.f17628c);
                return;
        }
    }
}
