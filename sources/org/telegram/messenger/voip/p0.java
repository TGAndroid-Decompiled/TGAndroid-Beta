package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f17919a;
    public final VoIPService f17920b;

    public p0(VoIPService voIPService, int i10) {
        this.f17919a = i10;
        this.f17920b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f17919a) {
            case 0:
                VoIPService.i0(this.f17920b);
                return;
            case 1:
                VoIPService.H(this.f17920b);
                return;
            default:
                VoIPService.K0(this.f17920b);
                return;
        }
    }
}
