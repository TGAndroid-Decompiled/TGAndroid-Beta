package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f19907a;
    public final VoIPService f19908b;

    public p0(VoIPService voIPService, int i10) {
        this.f19907a = i10;
        this.f19908b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19907a) {
            case 0:
                VoIPService.k0(this.f19908b);
                return;
            case 1:
                VoIPService.L(this.f19908b);
                return;
            default:
                VoIPService.o1(this.f19908b);
                return;
        }
    }
}
