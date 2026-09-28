package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f17948a;
    public final VoIPService f17949b;

    public p0(VoIPService voIPService, int i10) {
        this.f17948a = i10;
        this.f17949b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f17948a) {
            case 0:
                VoIPService.i0(this.f17949b);
                return;
            case 1:
                VoIPService.H(this.f17949b);
                return;
            default:
                VoIPService.K0(this.f17949b);
                return;
        }
    }
}
