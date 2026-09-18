package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f17881a;
    public final VoIPService f17882b;

    public p0(VoIPService voIPService, int i10) {
        this.f17881a = i10;
        this.f17882b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f17881a) {
            case 0:
                VoIPService.i0(this.f17882b);
                return;
            case 1:
                VoIPService.H(this.f17882b);
                return;
            default:
                VoIPService.K0(this.f17882b);
                return;
        }
    }
}
