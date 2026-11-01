package org.telegram.messenger.voip;
public final class s0 implements Runnable {
    public final int f18861a;
    public final VoIPService f18862b;

    public s0(VoIPService voIPService, int i10) {
        this.f18861a = i10;
        this.f18862b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f18861a) {
            case 0:
                VoIPService.k0(this.f18862b);
                return;
            case 1:
                VoIPService.L(this.f18862b);
                return;
            default:
                VoIPService.o1(this.f18862b);
                return;
        }
    }
}
