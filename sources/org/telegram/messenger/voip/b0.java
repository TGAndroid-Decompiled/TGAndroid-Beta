package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f17880a;
    public final VoIPService f17881b;
    public final int f17882c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f17880a = i11;
        this.f17881b = voIPService;
        this.f17882c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17880a) {
            case 0:
                VoIPService.W(this.f17881b, this.f17882c);
                return;
            case 1:
                VoIPService.q0(this.f17881b, this.f17882c);
                return;
            case 2:
                VoIPService.O0(this.f17881b, this.f17882c);
                return;
            case 3:
                VoIPService.R(this.f17881b, this.f17882c);
                return;
            case 4:
                VoIPService.j1(this.f17881b, this.f17882c);
                return;
            case 5:
                VoIPService.t0(this.f17881b, this.f17882c);
                return;
            default:
                VoIPService.z0(this.f17881b, this.f17882c);
                return;
        }
    }
}
