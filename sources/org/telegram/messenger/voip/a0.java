package org.telegram.messenger.voip;
public final class a0 implements Runnable {
    public final int f21923a;
    public final VoIPService f21924b;
    public final int f21925c;

    public a0(VoIPService voIPService, int i10, int i11) {
        this.f21923a = i11;
        this.f21924b = voIPService;
        this.f21925c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21923a) {
            case 0:
                VoIPService.W(this.f21924b, this.f21925c);
                return;
            case 1:
                VoIPService.q0(this.f21924b, this.f21925c);
                return;
            case 2:
                VoIPService.O0(this.f21924b, this.f21925c);
                return;
            case 3:
                VoIPService.R(this.f21924b, this.f21925c);
                return;
            case 4:
                VoIPService.j1(this.f21924b, this.f21925c);
                return;
            case 5:
                VoIPService.t0(this.f21924b, this.f21925c);
                return;
            default:
                VoIPService.z0(this.f21924b, this.f21925c);
                return;
        }
    }
}
