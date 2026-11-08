package org.telegram.messenger;

import android.media.AudioRecord;
public final class xd implements Runnable {
    public final int f26466a;
    public final MediaController f26467b;
    public final boolean f26468c;

    public xd(MediaController mediaController, boolean z9, int i7) {
        this.f26466a = i7;
        this.f26467b = mediaController;
        this.f26468c = z9;
    }

    @Override
    public final void run() {
        switch (this.f26466a) {
            case 0:
                MediaController mediaController = this.f26467b;
                p5 p5Var = mediaController.M1;
                if (mediaController.f21266f1 != null && mediaController.f21274j1 != null) {
                    boolean z9 = mediaController.f21260d1;
                    mediaController.f21260d1 = !z9;
                    if (!z9) {
                        AudioRecord audioRecord = mediaController.f21263e1;
                        if (audioRecord != null) {
                            mediaController.B1 = 4;
                            audioRecord.stop();
                            mediaController.f21263e1.release();
                            mediaController.f21263e1 = null;
                            p5Var.c(new xd(mediaController, this.f26468c, 1));
                            return;
                        }
                        return;
                    }
                    p5Var.a(mediaController.O1);
                    p5Var.c(new vd(mediaController, 6));
                    return;
                }
                return;
            default:
                MediaController.a(this.f26467b, this.f26468c);
                return;
        }
    }
}
