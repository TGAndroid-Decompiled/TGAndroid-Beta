package org.telegram.messenger;

import android.media.AudioRecord;
public final class qd implements Runnable {
    public final int f24877a;
    public final MediaController f24878b;
    public final boolean f24879c;

    public qd(MediaController mediaController, boolean z10, int i3) {
        this.f24877a = i3;
        this.f24878b = mediaController;
        this.f24879c = z10;
    }

    @Override
    public final void run() {
        switch (this.f24877a) {
            case 0:
                MediaController mediaController = this.f24878b;
                p5 p5Var = mediaController.N1;
                if (mediaController.f21319g1 != null && mediaController.k1 != null) {
                    boolean z10 = mediaController.f21314e1;
                    mediaController.f21314e1 = !z10;
                    if (!z10) {
                        AudioRecord audioRecord = mediaController.f21317f1;
                        if (audioRecord != null) {
                            mediaController.C1 = 4;
                            audioRecord.stop();
                            mediaController.f21317f1.release();
                            mediaController.f21317f1 = null;
                            p5Var.c(new qd(mediaController, this.f24879c, 1));
                            return;
                        }
                        return;
                    }
                    p5Var.a(mediaController.P1);
                    p5Var.c(new od(mediaController, 6));
                    return;
                }
                return;
            default:
                MediaController.a(this.f24878b, this.f24879c);
                return;
        }
    }
}
