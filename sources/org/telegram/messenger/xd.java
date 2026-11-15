package org.telegram.messenger;
public final class xd implements Runnable {
    public final int f27485a;
    public final MediaController f27486b;
    public final int f27487c;

    public xd(MediaController mediaController, int i7, int i10) {
        this.f27485a = i10;
        this.f27486b = mediaController;
        this.f27487c = i7;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f27485a;
        int i11 = this.f27487c;
        MediaController mediaController = this.f27486b;
        switch (i10) {
            case 0:
                ns f10 = ns.f(mediaController.f22352i1);
                Integer valueOf = Integer.valueOf(mediaController.f22350h1);
                if (i11 == 2) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                f10.k(157, valueOf, Integer.valueOf(i7));
                return;
            default:
                if (i11 == -1) {
                    if (mediaController.I(mediaController.f22377v0) && !mediaController.H()) {
                        mediaController.R(mediaController.f22377v0, true);
                    }
                    mediaController.V = 0;
                    mediaController.Y = 0;
                } else if (i11 == 1) {
                    mediaController.Y = 2;
                    if (mediaController.Z) {
                        mediaController.Z = false;
                        if (mediaController.I(mediaController.f22377v0) && mediaController.H()) {
                            mediaController.S(mediaController.f22377v0);
                        }
                    }
                } else if (i11 == -3) {
                    mediaController.Y = 1;
                } else if (i11 == -2) {
                    mediaController.Y = 0;
                    if (mediaController.I(mediaController.f22377v0) && !mediaController.H()) {
                        mediaController.R(mediaController.f22377v0, true);
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
