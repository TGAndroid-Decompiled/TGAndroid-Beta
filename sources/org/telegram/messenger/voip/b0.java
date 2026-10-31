package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f18619a;
    public final VoIPService f18620b;
    public final int f18621c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f18619a = i11;
        this.f18620b = voIPService;
        this.f18621c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18619a) {
            case 0:
                VoIPService.u1(this.f18620b, this.f18621c);
                return;
            case 1:
                VoIPService.K0(this.f18620b, this.f18621c);
                return;
            case 2:
                VoIPService.q0(this.f18620b, this.f18621c);
                return;
            case 3:
                VoIPService.U(this.f18620b, this.f18621c);
                return;
            case 4:
                VoIPService.k1(this.f18620b, this.f18621c);
                return;
            case 5:
                VoIPService.t0(this.f18620b, this.f18621c);
                return;
            default:
                VoIPService.A0(this.f18620b, this.f18621c);
                return;
        }
    }
}
