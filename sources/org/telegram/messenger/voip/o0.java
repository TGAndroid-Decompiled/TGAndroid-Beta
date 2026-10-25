package org.telegram.messenger.voip;
public final class o0 implements Runnable {
    public final int f21675a;
    public final VoIPService f21676b;

    public o0(VoIPService voIPService, int i10) {
        this.f21675a = i10;
        this.f21676b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f21675a) {
            case 0:
                VoIPService.k0(this.f21676b);
                return;
            case 1:
                VoIPService.L(this.f21676b);
                return;
            default:
                VoIPService.o1(this.f21676b);
                return;
        }
    }
}
