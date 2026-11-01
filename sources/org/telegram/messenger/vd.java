package org.telegram.messenger;
public final class vd implements Runnable {
    public final int f18609a;
    public final MediaController f18610b;
    public final int f18611c;

    public vd(MediaController mediaController, int i10, int i11) {
        this.f18609a = i11;
        this.f18610b = mediaController;
        this.f18611c = i10;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f18609a;
        int i12 = this.f18611c;
        MediaController mediaController = this.f18610b;
        switch (i11) {
            case 0:
                at f7 = at.f(mediaController.f14455g1);
                Integer valueOf = Integer.valueOf(mediaController.f14453f1);
                if (i12 == 2) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                f7.k(157, valueOf, Integer.valueOf(i10));
                return;
            default:
                if (i12 == -1) {
                    if (mediaController.I(mediaController.f14483u0) && !mediaController.H()) {
                        mediaController.R(mediaController.f14483u0, true);
                    }
                    mediaController.U = 0;
                    mediaController.X = 0;
                } else if (i12 == 1) {
                    mediaController.X = 2;
                    if (mediaController.Y) {
                        mediaController.Y = false;
                        if (mediaController.I(mediaController.f14483u0) && mediaController.H()) {
                            mediaController.S(mediaController.f14483u0);
                        }
                    }
                } else if (i12 == -3) {
                    mediaController.X = 1;
                } else if (i12 == -2) {
                    mediaController.X = 0;
                    if (mediaController.I(mediaController.f14483u0) && !mediaController.H()) {
                        mediaController.R(mediaController.f14483u0, true);
                        mediaController.Y = true;
                    }
                } else {
                    String[] strArr = MediaController.U1;
                }
                mediaController.n0();
                return;
        }
    }
}
