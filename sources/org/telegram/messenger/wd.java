package org.telegram.messenger;

import android.media.AudioRecord;
public final class wd implements Runnable {
    public final int f27334a;
    public final MediaController f27335b;
    public final boolean f27336c;

    public wd(MediaController mediaController, boolean z10, int i7) {
        this.f27334a = i7;
        this.f27335b = mediaController;
        this.f27336c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27334a) {
            case 0:
                MediaController mediaController = this.f27335b;
                p5 p5Var = mediaController.N1;
                if (mediaController.f22348g1 != null && mediaController.f22356k1 != null) {
                    boolean z10 = mediaController.f22343e1;
                    mediaController.f22343e1 = !z10;
                    if (!z10) {
                        AudioRecord audioRecord = mediaController.f22346f1;
                        if (audioRecord != null) {
                            mediaController.C1 = 4;
                            audioRecord.stop();
                            mediaController.f22346f1.release();
                            mediaController.f22346f1 = null;
                            p5Var.c(new wd(mediaController, this.f27336c, 1));
                            return;
                        }
                        return;
                    }
                    p5Var.a(mediaController.P1);
                    p5Var.c(new ud(mediaController, 6));
                    return;
                }
                return;
            default:
                MediaController.a(this.f27335b, this.f27336c);
                return;
        }
    }
}
