package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f20385a;
    public final VoIPService f20386b;
    public final int f20387c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f20385a = i11;
        this.f20386b = voIPService;
        this.f20387c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20385a) {
            case 0:
                VoIPService.W(this.f20386b, this.f20387c);
                return;
            case 1:
                VoIPService.q0(this.f20386b, this.f20387c);
                return;
            case 2:
                VoIPService.O0(this.f20386b, this.f20387c);
                return;
            case 3:
                VoIPService.R(this.f20386b, this.f20387c);
                return;
            case 4:
                VoIPService.j1(this.f20386b, this.f20387c);
                return;
            case 5:
                VoIPService.t0(this.f20386b, this.f20387c);
                return;
            default:
                VoIPService.z0(this.f20386b, this.f20387c);
                return;
        }
    }
}
