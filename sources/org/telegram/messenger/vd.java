package org.telegram.messenger;

import android.media.AudioRecord;
public final class vd implements Runnable {
    public final int f27354a;
    public final MediaController f27355b;
    public final boolean f27356c;

    public vd(MediaController mediaController, boolean z10, int i7) {
        this.f27354a = i7;
        this.f27355b = mediaController;
        this.f27356c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27354a) {
            case 0:
                MediaController mediaController = this.f27355b;
                q5 q5Var = mediaController.N1;
                if (mediaController.f22714g1 != null && mediaController.f22722k1 != null) {
                    boolean z10 = mediaController.f22709e1;
                    mediaController.f22709e1 = !z10;
                    if (!z10) {
                        AudioRecord audioRecord = mediaController.f22712f1;
                        if (audioRecord != null) {
                            mediaController.C1 = 4;
                            audioRecord.stop();
                            mediaController.f22712f1.release();
                            mediaController.f22712f1 = null;
                            q5Var.c(new vd(mediaController, this.f27356c, 1));
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
                MediaController.a(this.f27355b, this.f27356c);
                return;
        }
    }
}
