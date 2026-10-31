package org.telegram.messenger;
public final class ud implements Runnable {
    public final int f18280a;
    public final MediaController f18281b;
    public final int f18282c;

    public ud(MediaController mediaController, int i10, int i11) {
        this.f18280a = i11;
        this.f18281b = mediaController;
        this.f18282c = i10;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f18280a;
        int i12 = this.f18282c;
        MediaController mediaController = this.f18281b;
        switch (i11) {
            case 0:
                zs f7 = zs.f(mediaController.f14454g1);
                Integer valueOf = Integer.valueOf(mediaController.f14452f1);
                if (i12 == 2) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                f7.k(157, valueOf, Integer.valueOf(i10));
                return;
            default:
                if (i12 == -1) {
                    if (mediaController.I(mediaController.f14482u0) && !mediaController.H()) {
                        mediaController.R(mediaController.f14482u0, true);
                    }
                    mediaController.U = 0;
                    mediaController.X = 0;
                } else if (i12 == 1) {
                    mediaController.X = 2;
                    if (mediaController.Y) {
                        mediaController.Y = false;
                        if (mediaController.I(mediaController.f14482u0) && mediaController.H()) {
                            mediaController.S(mediaController.f14482u0);
                        }
                    }
                } else if (i12 == -3) {
                    mediaController.X = 1;
                } else if (i12 == -2) {
                    mediaController.X = 0;
                    if (mediaController.I(mediaController.f14482u0) && !mediaController.H()) {
                        mediaController.R(mediaController.f14482u0, true);
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
