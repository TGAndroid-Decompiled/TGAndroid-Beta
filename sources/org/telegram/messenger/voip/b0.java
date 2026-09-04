package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f19329a;
    public final VoIPService f19330b;
    public final int f19331c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f19329a = i11;
        this.f19330b = voIPService;
        this.f19331c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19329a) {
            case 0:
                VoIPService.W(this.f19330b, this.f19331c);
                return;
            case 1:
                VoIPService.q0(this.f19330b, this.f19331c);
                return;
            case 2:
                VoIPService.O0(this.f19330b, this.f19331c);
                return;
            case 3:
                VoIPService.R(this.f19330b, this.f19331c);
                return;
            case 4:
                VoIPService.j1(this.f19330b, this.f19331c);
                return;
            case 5:
                VoIPService.t0(this.f19330b, this.f19331c);
                return;
            default:
                VoIPService.z0(this.f19330b, this.f19331c);
                return;
        }
    }
}
