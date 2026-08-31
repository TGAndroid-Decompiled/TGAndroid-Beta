package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f20454a;
    public final VoIPService f20455b;

    public p0(VoIPService voIPService, int i10) {
        this.f20454a = i10;
        this.f20455b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f20454a) {
            case 0:
                VoIPService.i0(this.f20455b);
                return;
            case 1:
                VoIPService.H(this.f20455b);
                return;
            default:
                VoIPService.K0(this.f20455b);
                return;
        }
    }
}
