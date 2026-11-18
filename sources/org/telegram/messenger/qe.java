package org.telegram.messenger;
public final class qe implements Runnable {
    public final MediaController f26392a;

    public qe(MediaController mediaController) {
        this.f26392a = mediaController;
    }

    @Override
    public final void run() {
        MediaController mediaController = this.f26392a;
        fj fjVar = mediaController.f22743v0;
        if (fjVar == null) {
            return;
        }
        w7.G(fjVar.K1).b0(mediaController.f22743v0.F0(), true, false);
    }
}
