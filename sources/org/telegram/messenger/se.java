package org.telegram.messenger;
public final class se implements Runnable {
    public final MediaController f18087a;

    public se(MediaController mediaController) {
        this.f18087a = mediaController;
    }

    @Override
    public final void run() {
        MediaController mediaController = this.f18087a;
        kj kjVar = mediaController.f14483u0;
        if (kjVar == null) {
            return;
        }
        b8.G(kjVar.I1).c0(mediaController.f14483u0.F0(), true, false);
    }
}
