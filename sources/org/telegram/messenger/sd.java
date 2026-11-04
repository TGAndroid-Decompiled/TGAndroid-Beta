package org.telegram.messenger;
public final class sd implements Runnable {
    public final int f25306a;
    public final MediaController f25307b;
    public final int f25308c;

    public sd(MediaController mediaController, int i3, int i10) {
        this.f25306a = i10;
        this.f25307b = mediaController;
        this.f25308c = i3;
    }

    @Override
    public final void run() {
        int i3;
        int i10 = this.f25306a;
        int i11 = this.f25308c;
        MediaController mediaController = this.f25307b;
        switch (i10) {
            case 0:
                hs f10 = hs.f(mediaController.f21323i1);
                Integer valueOf = Integer.valueOf(mediaController.f21321h1);
                if (i11 == 2) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                f10.k(157, valueOf, Integer.valueOf(i3));
                return;
            default:
                if (i11 == -1) {
                    if (mediaController.I(mediaController.f21348v0) && !mediaController.H()) {
                        mediaController.R(mediaController.f21348v0, true);
                    }
                    mediaController.V = 0;
                    mediaController.Y = 0;
                } else if (i11 == 1) {
                    mediaController.Y = 2;
                    if (mediaController.Z) {
                        mediaController.Z = false;
                        if (mediaController.I(mediaController.f21348v0) && mediaController.H()) {
                            mediaController.S(mediaController.f21348v0);
                        }
                    }
                } else if (i11 == -3) {
                    mediaController.Y = 1;
                } else if (i11 == -2) {
                    mediaController.Y = 0;
                    if (mediaController.I(mediaController.f21348v0) && !mediaController.H()) {
                        mediaController.R(mediaController.f21348v0, true);
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
