package org.telegram.messenger.voip;
public final class n0 implements Runnable {
    public final int f26038a;
    public final VoIPService f26039b;

    public n0(VoIPService voIPService, int i3) {
        this.f26038a = i3;
        this.f26039b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f26038a) {
            case 0:
                VoIPService.k0(this.f26039b);
                return;
            case 1:
                VoIPService.L(this.f26039b);
                return;
            default:
                VoIPService.o1(this.f26039b);
                return;
        }
    }
}
