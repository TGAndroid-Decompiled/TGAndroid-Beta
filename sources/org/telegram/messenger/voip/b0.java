package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f17854a;
    public final VoIPService f17855b;
    public final int f17856c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f17854a = i11;
        this.f17855b = voIPService;
        this.f17856c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17854a) {
            case 0:
                VoIPService.W(this.f17855b, this.f17856c);
                return;
            case 1:
                VoIPService.q0(this.f17855b, this.f17856c);
                return;
            case 2:
                VoIPService.O0(this.f17855b, this.f17856c);
                return;
            case 3:
                VoIPService.R(this.f17855b, this.f17856c);
                return;
            case 4:
                VoIPService.j1(this.f17855b, this.f17856c);
                return;
            case 5:
                VoIPService.t0(this.f17855b, this.f17856c);
                return;
            default:
                VoIPService.z0(this.f17855b, this.f17856c);
                return;
        }
    }
}
