package org.telegram.messenger;
public final class re implements Runnable {
    public final MediaController f26601a;

    public re(MediaController mediaController) {
        this.f26601a = mediaController;
    }

    @Override
    public final void run() {
        MediaController mediaController = this.f26601a;
        gj gjVar = mediaController.f22771v0;
        if (gjVar == null) {
            return;
        }
        w7.G(gjVar.K1).b0(mediaController.f22771v0.F0(), true, false);
    }
}
