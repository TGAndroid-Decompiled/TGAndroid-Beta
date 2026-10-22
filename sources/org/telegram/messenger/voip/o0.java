package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f19912a;
    public final VoIPService f19913b;

    public o0(VoIPService voIPService, int i10) {
        this.f19912a = i10;
        this.f19913b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19912a) {
            case 0:
                VoIPService.k0(this.f19913b);
                return;
            case 1:
                VoIPService.L(this.f19913b);
                return;
            default:
                VoIPService.o1(this.f19913b);
                return;
        }
    }
}
