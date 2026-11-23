package org.telegram.messenger;

import android.media.AudioRecord;
public final class wd implements Runnable {
    public final int f27685a;
    public final MediaController f27686b;
    public final boolean f27687c;

    public wd(MediaController mediaController, boolean z10, int i7) {
        this.f27685a = i7;
        this.f27686b = mediaController;
        this.f27687c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27685a) {
            case 0:
                MediaController mediaController = this.f27686b;
                q5 q5Var = mediaController.N1;
                if (mediaController.f22706g1 != null && mediaController.f22714k1 != null) {
                    boolean z10 = mediaController.f22701e1;
                    mediaController.f22701e1 = !z10;
                    if (!z10) {
                        AudioRecord audioRecord = mediaController.f22704f1;
                        if (audioRecord != null) {
                            mediaController.C1 = 4;
                            audioRecord.stop();
                            mediaController.f22704f1.release();
                            mediaController.f22704f1 = null;
                            q5Var.c(new wd(mediaController, this.f27687c, 1));
                            return;
                        }
                        return;
                    }
                    q5Var.a(mediaController.P1);
                    q5Var.c(new ud(mediaController, 6));
                    return;
                }
                return;
            default:
                MediaController.a(this.f27686b, this.f27687c);
                return;
        }
    }
}
