package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f19894a;
    public final VoIPService f19895b;

    public o0(VoIPService voIPService, int i10) {
        this.f19894a = i10;
        this.f19895b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19894a) {
            case 0:
                VoIPService.k0(this.f19895b);
                return;
            case 1:
                VoIPService.L(this.f19895b);
                return;
            default:
                VoIPService.o1(this.f19895b);
                return;
        }
    }
}
