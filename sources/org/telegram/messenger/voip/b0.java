package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f17869a;
    public final VoIPService f17870b;
    public final int f17871c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f17869a = i11;
        this.f17870b = voIPService;
        this.f17871c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17869a) {
            case 0:
                VoIPService.W(this.f17870b, this.f17871c);
                return;
            case 1:
                VoIPService.q0(this.f17870b, this.f17871c);
                return;
            case 2:
                VoIPService.O0(this.f17870b, this.f17871c);
                return;
            case 3:
                VoIPService.R(this.f17870b, this.f17871c);
                return;
            case 4:
                VoIPService.j1(this.f17870b, this.f17871c);
                return;
            case 5:
                VoIPService.t0(this.f17870b, this.f17871c);
                return;
            default:
                VoIPService.z0(this.f17870b, this.f17871c);
                return;
        }
    }
}
