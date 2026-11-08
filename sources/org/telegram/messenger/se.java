package org.telegram.messenger;
public final class se implements Runnable {
    public final MediaController f25466a;

    public se(MediaController mediaController) {
        this.f25466a = mediaController;
    }

    @Override
    public final void run() {
        MediaController mediaController = this.f25466a;
        ij ijVar = mediaController.f21295u0;
        if (ijVar == null) {
            return;
        }
        w7.G(ijVar.I1).b0(mediaController.f21295u0.F0(), true, false);
    }
}
