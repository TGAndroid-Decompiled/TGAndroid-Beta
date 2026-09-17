package org.telegram.messenger.voip;
public final class p0 implements Runnable {
    public final int f17704a;
    public final VoIPService f17705b;

    public p0(VoIPService voIPService, int i10) {
        this.f17704a = i10;
        this.f17705b = voIPService;
    }

    @Override
    public final void run() {
        switch (this.f17704a) {
            case 0:
                this.f17705b.destroyConverting();
                return;
            case 1:
                this.f17705b.lambda$updateConnectionState$82();
                return;
            default:
                this.f17705b.lambda$updateConnectionState$83();
                return;
        }
    }
}
