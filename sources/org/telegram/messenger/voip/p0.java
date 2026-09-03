package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f18805a;
    public final VoIPService f18806b;

    public p0(VoIPService voIPService, int i10) {
        this.f18805a = i10;
        this.f18806b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f18805a) {
            case 0:
                VoIPService.i0(this.f18806b);
                return;
            case 1:
                VoIPService.H(this.f18806b);
                return;
            default:
                VoIPService.K0(this.f18806b);
                return;
        }
    }
}
