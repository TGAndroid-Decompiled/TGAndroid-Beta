package org.telegram.messenger;

import android.media.AudioRecord;
public final class vd implements Runnable {
    public final int f27380a;
    public final MediaController f27381b;
    public final boolean f27382c;

    public vd(MediaController mediaController, boolean z10, int i7) {
        this.f27380a = i7;
        this.f27381b = mediaController;
        this.f27382c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27380a) {
            case 0:
                MediaController mediaController = this.f27381b;
                q5 q5Var = mediaController.N1;
                if (mediaController.f22739g1 != null && mediaController.f22747k1 != null) {
                    boolean z10 = mediaController.f22734e1;
                    mediaController.f22734e1 = !z10;
                    if (!z10) {
                        AudioRecord audioRecord = mediaController.f22737f1;
                        if (audioRecord != null) {
                            mediaController.C1 = 4;
                            audioRecord.stop();
                            mediaController.f22737f1.release();
                            mediaController.f22737f1 = null;
                            q5Var.c(new vd(mediaController, this.f27382c, 1));
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
                MediaController.a(this.f27381b, this.f27382c);
                return;
        }
    }
}
