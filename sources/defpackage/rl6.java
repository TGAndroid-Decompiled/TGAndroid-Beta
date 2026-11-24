package defpackage;

import org.telegram.messenger.MediaController;
public final class rl6 implements Runnable {
    public final MediaController a;

    public rl6(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override
    public final void run() {
        MediaController mediaController = this.a;
        k27 k27Var = mediaController.v0;
        if (k27Var == null) {
            return;
        }
        ba4.G(k27Var.K1).b0(mediaController.v0.F0(), true, false);
    }
}
