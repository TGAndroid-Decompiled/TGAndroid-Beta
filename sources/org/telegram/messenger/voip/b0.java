package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f17879a;
    public final VoIPService f17880b;
    public final int f17881c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f17879a = i11;
        this.f17880b = voIPService;
        this.f17881c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17879a) {
            case 0:
                VoIPService.W(this.f17880b, this.f17881c);
                return;
            case 1:
                VoIPService.q0(this.f17880b, this.f17881c);
                return;
            case 2:
                VoIPService.O0(this.f17880b, this.f17881c);
                return;
            case 3:
                VoIPService.R(this.f17880b, this.f17881c);
                return;
            case 4:
                VoIPService.j1(this.f17880b, this.f17881c);
                return;
            case 5:
                VoIPService.t0(this.f17880b, this.f17881c);
                return;
            default:
                VoIPService.z0(this.f17880b, this.f17881c);
                return;
        }
    }
}
