package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f20456a;
    public final VoIPService f20457b;

    public p0(VoIPService voIPService, int i10) {
        this.f20456a = i10;
        this.f20457b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f20456a) {
            case 0:
                VoIPService.i0(this.f20457b);
                return;
            case 1:
                VoIPService.H(this.f20457b);
                return;
            default:
                VoIPService.K0(this.f20457b);
                return;
        }
    }
}
