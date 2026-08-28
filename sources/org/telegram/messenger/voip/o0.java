package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f21930a;
    public final VoIPService f21931b;

    public o0(VoIPService voIPService, int i9) {
        this.f21930a = i9;
        this.f21931b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f21930a) {
            case 0:
                VoIPService.i0(this.f21931b);
                return;
            case 1:
                VoIPService.H(this.f21931b);
                return;
            default:
                VoIPService.K0(this.f21931b);
                return;
        }
    }
}
