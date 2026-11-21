package org.telegram.messenger;
public final class qe implements Runnable {
    public final MediaController f26418a;

    public qe(MediaController mediaController) {
        this.f26418a = mediaController;
    }

    @Override
    public final void run() {
        MediaController mediaController = this.f26418a;
        fj fjVar = mediaController.f22768v0;
        if (fjVar == null) {
            return;
        }
        w7.G(fjVar.K1).b0(mediaController.f22768v0.F0(), true, false);
    }
}
