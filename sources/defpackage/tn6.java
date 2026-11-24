package defpackage;

import org.telegram.messenger.MediaController;
public final class tn6 implements Runnable {
    public final MediaController a;

    public tn6(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override
    public final void run() {
        MediaController mediaController = this.a;
        k47 k47Var = mediaController.v0;
        if (k47Var == null) {
            return;
        }
        bc4.G(k47Var.K1).b0(mediaController.v0.F0(), true, false);
    }
}
