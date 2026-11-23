package org.telegram.messenger;

import android.media.AudioRecord;
public final class vd implements Runnable {
    public final int f27448a;
    public final MediaController f27449b;
    public final boolean f27450c;

    public vd(MediaController mediaController, boolean z10, int i7) {
        this.f27448a = i7;
        this.f27449b = mediaController;
        this.f27450c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27448a) {
            case 0:
                MediaController mediaController = this.f27449b;
                q5 q5Var = mediaController.N1;
                if (mediaController.f22809g1 != null && mediaController.f22817k1 != null) {
                    boolean z10 = mediaController.f22804e1;
                    mediaController.f22804e1 = !z10;
                    if (!z10) {
                        AudioRecord audioRecord = mediaController.f22807f1;
                        if (audioRecord != null) {
                            mediaController.C1 = 4;
                            audioRecord.stop();
                            mediaController.f22807f1.release();
                            mediaController.f22807f1 = null;
                            q5Var.c(new vd(mediaController, this.f27450c, 1));
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
                MediaController.a(this.f27449b, this.f27450c);
                return;
        }
    }
}
