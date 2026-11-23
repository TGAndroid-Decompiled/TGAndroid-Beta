package org.telegram.messenger;
public final class wd implements Runnable {
    public final int f27765a;
    public final MediaController f27766b;
    public final int f27767c;

    public wd(MediaController mediaController, int i7, int i10) {
        this.f27765a = i10;
        this.f27766b = mediaController;
        this.f27767c = i7;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f27765a;
        int i11 = this.f27767c;
        MediaController mediaController = this.f27766b;
        switch (i10) {
            case 0:
                ks f10 = ks.f(mediaController.f22813i1);
                Integer valueOf = Integer.valueOf(mediaController.f22811h1);
                if (i11 == 2) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                f10.k(157, valueOf, Integer.valueOf(i7));
                return;
            default:
                if (i11 == -1) {
                    if (mediaController.I(mediaController.f22838v0) && !mediaController.H()) {
                        mediaController.R(mediaController.f22838v0, true);
                    }
                    mediaController.V = 0;
                    mediaController.Y = 0;
                } else if (i11 == 1) {
                    mediaController.Y = 2;
                    if (mediaController.Z) {
                        mediaController.Z = false;
                        if (mediaController.I(mediaController.f22838v0) && mediaController.H()) {
                            mediaController.S(mediaController.f22838v0);
                        }
                    }
                } else if (i11 == -3) {
                    mediaController.Y = 1;
                } else if (i11 == -2) {
                    mediaController.Y = 0;
                    if (mediaController.I(mediaController.f22838v0) && !mediaController.H()) {
                        mediaController.R(mediaController.f22838v0, true);
                        mediaController.Z = true;
                    }
                } else {
                    String[] strArr = MediaController.W1;
                }
                mediaController.n0();
                return;
        }
    }
}
