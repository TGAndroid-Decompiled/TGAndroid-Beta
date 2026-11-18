package org.telegram.messenger;

import android.media.AudioRecord;
public final class vd implements Runnable {
    public final int f27352a;
    public final MediaController f27353b;
    public final boolean f27354c;

    public vd(MediaController mediaController, boolean z10, int i7) {
        this.f27352a = i7;
        this.f27353b = mediaController;
        this.f27354c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27352a) {
            case 0:
                MediaController mediaController = this.f27353b;
                q5 q5Var = mediaController.N1;
                if (mediaController.f22711g1 != null && mediaController.f22719k1 != null) {
                    boolean z10 = mediaController.f22706e1;
                    mediaController.f22706e1 = !z10;
                    if (!z10) {
                        AudioRecord audioRecord = mediaController.f22709f1;
                        if (audioRecord != null) {
                            mediaController.C1 = 4;
                            audioRecord.stop();
                            mediaController.f22709f1.release();
                            mediaController.f22709f1 = null;
                            q5Var.c(new vd(mediaController, this.f27354c, 1));
                            return;
                        }
                        return;
                    }
                    q5Var.a(mediaController.P1);
                    q5Var.c(new td(mediaController, 6));
                    return;
                }
                return;
            default:
                MediaController.a(this.f27353b, this.f27354c);
                return;
        }
    }
}
