package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f18740a;
    public final VoIPService f18741b;
    public final int f18742c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f18740a = i11;
        this.f18741b = voIPService;
        this.f18742c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18740a) {
            case 0:
                VoIPService.W(this.f18741b, this.f18742c);
                return;
            case 1:
                VoIPService.q0(this.f18741b, this.f18742c);
                return;
            case 2:
                VoIPService.O0(this.f18741b, this.f18742c);
                return;
            case 3:
                VoIPService.R(this.f18741b, this.f18742c);
                return;
            case 4:
                VoIPService.j1(this.f18741b, this.f18742c);
                return;
            case 5:
                VoIPService.t0(this.f18741b, this.f18742c);
                return;
            default:
                VoIPService.z0(this.f18741b, this.f18742c);
                return;
        }
    }
}
