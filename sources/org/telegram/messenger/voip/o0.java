package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f19891a;
    public final VoIPService f19892b;

    public o0(VoIPService voIPService, int i10) {
        this.f19891a = i10;
        this.f19892b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f19891a) {
            case 0:
                VoIPService.k0(this.f19892b);
                return;
            case 1:
                VoIPService.L(this.f19892b);
                return;
            default:
                VoIPService.o1(this.f19892b);
                return;
        }
    }
}
