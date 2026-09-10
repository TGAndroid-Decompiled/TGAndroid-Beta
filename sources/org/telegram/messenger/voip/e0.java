package org.telegram.messenger.voip;
public final class e0 implements Runnable {
    public final int f16712a;
    public final VoIPService f16713b;
    public final int f16714c;

    public e0(VoIPService voIPService, int i10, int i11) {
        this.f16712a = i11;
        this.f16713b = voIPService;
        this.f16714c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16712a) {
            case 0:
                VoIPService.W(this.f16713b, this.f16714c);
                return;
            case 1:
                VoIPService.q0(this.f16713b, this.f16714c);
                return;
            case 2:
                VoIPService.O0(this.f16713b, this.f16714c);
                return;
            case 3:
                VoIPService.R(this.f16713b, this.f16714c);
                return;
            case 4:
                VoIPService.j1(this.f16713b, this.f16714c);
                return;
            case 5:
                VoIPService.t0(this.f16713b, this.f16714c);
                return;
            default:
                VoIPService.z0(this.f16713b, this.f16714c);
                return;
        }
    }
}
