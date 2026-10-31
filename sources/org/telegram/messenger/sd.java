package org.telegram.messenger;

import android.media.AudioRecord;
public final class sd implements Runnable {
    public final int f17897a;
    public final MediaController f17898b;
    public final boolean f17899c;

    public sd(MediaController mediaController, boolean z10, int i10) {
        this.f17897a = i10;
        this.f17898b = mediaController;
        this.f17899c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17897a) {
            case 0:
                MediaController mediaController = this.f17898b;
                r5 r5Var = mediaController.L1;
                if (mediaController.f14449e1 != null && mediaController.f14458i1 != null) {
                    boolean z10 = mediaController.f14445c1;
                    mediaController.f14445c1 = !z10;
                    if (!z10) {
                        AudioRecord audioRecord = mediaController.f14447d1;
                        if (audioRecord != null) {
                            mediaController.A1 = 4;
                            audioRecord.stop();
                            mediaController.f14447d1.release();
                            mediaController.f14447d1 = null;
                            r5Var.c(new sd(mediaController, this.f17899c, 1));
                            return;
                        }
                        return;
                    }
                    r5Var.a(mediaController.N1);
                    r5Var.c(new qd(mediaController, 6));
                    return;
                }
                return;
            default:
                MediaController.a(this.f17898b, this.f17899c);
                return;
        }
    }
}
