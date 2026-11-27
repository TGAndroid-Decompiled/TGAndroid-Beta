package defpackage;

import org.telegram.messenger.MediaController;
public final class xn6 implements Runnable {
    public final MediaController a;

    public xn6(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override
    public final void run() {
        MediaController mediaController = this.a;
        r47 r47Var = mediaController.v0;
        if (r47Var == null) {
            return;
        }
        xb4.G(r47Var.K1).b0(mediaController.v0.F0(), true, false);
    }
}
