package org.telegram.messenger;

import android.media.AudioRecord;
public final class xd implements Runnable {
    public final int f26451a;
    public final MediaController f26452b;
    public final boolean f26453c;

    public xd(MediaController mediaController, boolean z9, int i7) {
        this.f26451a = i7;
        this.f26452b = mediaController;
        this.f26453c = z9;
    }

    @Override
    public final void run() {
        switch (this.f26451a) {
            case 0:
                MediaController mediaController = this.f26452b;
                p5 p5Var = mediaController.M1;
                if (mediaController.f21263f1 != null && mediaController.f21271j1 != null) {
                    boolean z9 = mediaController.f21257d1;
                    mediaController.f21257d1 = !z9;
                    if (!z9) {
                        AudioRecord audioRecord = mediaController.f21260e1;
                        if (audioRecord != null) {
                            mediaController.B1 = 4;
                            audioRecord.stop();
                            mediaController.f21260e1.release();
                            mediaController.f21260e1 = null;
                            p5Var.c(new xd(mediaController, this.f26453c, 1));
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
                MediaController.a(this.f26452b, this.f26453c);
                return;
        }
    }
}
