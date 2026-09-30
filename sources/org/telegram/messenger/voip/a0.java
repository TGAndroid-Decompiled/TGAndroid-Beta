package org.telegram.messenger.voip;
public final class a0 implements Runnable {
    public final int f17873a;
    public final VoIPService f17874b;
    public final int f17875c;

    public a0(VoIPService voIPService, int i10, int i11) {
        this.f17873a = i11;
        this.f17874b = voIPService;
        this.f17875c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17873a) {
            case 0:
                VoIPService.u1(this.f17874b, this.f17875c);
                return;
            case 1:
                VoIPService.K0(this.f17874b, this.f17875c);
                return;
            case 2:
                VoIPService.q0(this.f17874b, this.f17875c);
                return;
            case 3:
                VoIPService.U(this.f17874b, this.f17875c);
                return;
            case 4:
                VoIPService.k1(this.f17874b, this.f17875c);
                return;
            case 5:
                VoIPService.t0(this.f17874b, this.f17875c);
                return;
            default:
                VoIPService.A0(this.f17874b, this.f17875c);
                return;
        }
    }
}
