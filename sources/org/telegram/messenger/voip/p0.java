package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f17932a;
    public final VoIPService f17933b;

    public p0(VoIPService voIPService, int i10) {
        this.f17932a = i10;
        this.f17933b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f17932a) {
            case 0:
                VoIPService.i0(this.f17933b);
                return;
            case 1:
                VoIPService.H(this.f17933b);
                return;
            default:
                VoIPService.K0(this.f17933b);
                return;
        }
    }
}
