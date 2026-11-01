package org.telegram.messenger;

import android.media.AudioRecord;
public final class td implements Runnable {
    public final int f18248a;
    public final MediaController f18249b;
    public final boolean f18250c;

    public td(MediaController mediaController, boolean z10, int i10) {
        this.f18248a = i10;
        this.f18249b = mediaController;
        this.f18250c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18248a) {
            case 0:
                MediaController mediaController = this.f18249b;
                r5 r5Var = mediaController.L1;
                if (mediaController.f14450e1 != null && mediaController.f14459i1 != null) {
                    boolean z10 = mediaController.f14446c1;
                    mediaController.f14446c1 = !z10;
                    if (!z10) {
                        AudioRecord audioRecord = mediaController.f14448d1;
                        if (audioRecord != null) {
                            mediaController.A1 = 4;
                            audioRecord.stop();
                            mediaController.f14448d1.release();
                            mediaController.f14448d1 = null;
                            r5Var.c(new td(mediaController, this.f18250c, 1));
                            return;
                        }
                        return;
                    }
                    r5Var.a(mediaController.N1);
                    r5Var.c(new rd(mediaController, 6));
                    return;
                }
                return;
            default:
                MediaController.a(this.f18249b, this.f18250c);
                return;
        }
    }
}
