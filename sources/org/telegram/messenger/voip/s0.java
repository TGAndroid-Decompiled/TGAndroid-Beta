package org.telegram.messenger.voip;
public final class s0 implements Runnable {
    public final int f16785a;
    public final VoIPService f16786b;

    public s0(VoIPService voIPService, int i10) {
        this.f16785a = i10;
        this.f16786b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f16785a) {
            case 0:
                VoIPService.i0(this.f16786b);
                return;
            case 1:
                VoIPService.H(this.f16786b);
                return;
            default:
                VoIPService.K0(this.f16786b);
                return;
        }
    }
}
