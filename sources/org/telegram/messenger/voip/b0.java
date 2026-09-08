package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f19356a;
    public final VoIPService f19357b;
    public final int f19358c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f19356a = i11;
        this.f19357b = voIPService;
        this.f19358c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19356a) {
            case 0:
                VoIPService.W(this.f19357b, this.f19358c);
                return;
            case 1:
                VoIPService.q0(this.f19357b, this.f19358c);
                return;
            case 2:
                VoIPService.O0(this.f19357b, this.f19358c);
                return;
            case 3:
                VoIPService.R(this.f19357b, this.f19358c);
                return;
            case 4:
                VoIPService.j1(this.f19357b, this.f19358c);
                return;
            case 5:
                VoIPService.t0(this.f19357b, this.f19358c);
                return;
            default:
                VoIPService.z0(this.f19357b, this.f19358c);
                return;
        }
    }
}
