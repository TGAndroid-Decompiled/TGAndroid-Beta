package org.telegram.messenger.voip;
public final class n0 implements Runnable {
    public final int f26155a;
    public final VoIPService f26156b;

    public n0(VoIPService voIPService, int i7) {
        this.f26155a = i7;
        this.f26156b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f26155a) {
            case 0:
                VoIPService.k0(this.f26156b);
                return;
            case 1:
                VoIPService.L(this.f26156b);
                return;
            default:
                VoIPService.o1(this.f26156b);
                return;
        }
    }
}
