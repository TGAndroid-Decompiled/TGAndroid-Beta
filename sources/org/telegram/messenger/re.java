package org.telegram.messenger;
public final class re implements Runnable {
    public final MediaController f17723a;

    public re(MediaController mediaController) {
        this.f17723a = mediaController;
    }

    @Override
    public final void run() {
        MediaController mediaController = this.f17723a;
        jj jjVar = mediaController.f14482u0;
        if (jjVar == null) {
            return;
        }
        b8.G(jjVar.I1).c0(mediaController.f14482u0.F0(), true, false);
    }
}
