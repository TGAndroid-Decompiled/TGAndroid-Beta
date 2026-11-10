package org.telegram.messenger;
public final class se implements Runnable {
    public final MediaController f25470a;

    public se(MediaController mediaController) {
        this.f25470a = mediaController;
    }

    @Override
    public final void run() {
        MediaController mediaController = this.f25470a;
        ij ijVar = mediaController.f21300u0;
        if (ijVar == null) {
            return;
        }
        w7.G(ijVar.I1).b0(mediaController.f21300u0.F0(), true, false);
    }
}
