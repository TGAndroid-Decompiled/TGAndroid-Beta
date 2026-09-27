package org.telegram.messenger.voip;
public final class b0 implements Runnable {
    public final int f17863a;
    public final VoIPService f17864b;
    public final int f17865c;

    public b0(VoIPService voIPService, int i10, int i11) {
        this.f17863a = i11;
        this.f17864b = voIPService;
        this.f17865c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17863a) {
            case 0:
                VoIPService.W(this.f17864b, this.f17865c);
                return;
            case 1:
                VoIPService.q0(this.f17864b, this.f17865c);
                return;
            case 2:
                VoIPService.O0(this.f17864b, this.f17865c);
                return;
            case 3:
                VoIPService.R(this.f17864b, this.f17865c);
                return;
            case 4:
                VoIPService.j1(this.f17864b, this.f17865c);
                return;
            case 5:
                VoIPService.t0(this.f17864b, this.f17865c);
                return;
            default:
                VoIPService.z0(this.f17864b, this.f17865c);
                return;
        }
    }
}
