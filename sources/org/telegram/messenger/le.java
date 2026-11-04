package org.telegram.messenger;
public final class le implements Runnable {
    public final MediaController f23985a;

    public le(MediaController mediaController) {
        this.f23985a = mediaController;
    }

    @Override
    public final void run() {
        MediaController mediaController = this.f23985a;
        zi ziVar = mediaController.f21348v0;
        if (ziVar == null) {
            return;
        }
        w7.G(ziVar.I1).c0(mediaController.f21348v0.F0(), true, false);
    }
}
