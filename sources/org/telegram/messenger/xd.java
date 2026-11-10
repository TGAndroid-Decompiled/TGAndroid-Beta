package org.telegram.messenger;

import android.media.AudioRecord;
public final class xd implements Runnable {
    public final int f26470a;
    public final MediaController f26471b;
    public final boolean f26472c;

    public xd(MediaController mediaController, boolean z9, int i7) {
        this.f26470a = i7;
        this.f26471b = mediaController;
        this.f26472c = z9;
    }

    @Override
    public final void run() {
        switch (this.f26470a) {
            case 0:
                MediaController mediaController = this.f26471b;
                p5 p5Var = mediaController.M1;
                if (mediaController.f21271f1 != null && mediaController.f21279j1 != null) {
                    boolean z9 = mediaController.f21265d1;
                    mediaController.f21265d1 = !z9;
                    if (!z9) {
                        AudioRecord audioRecord = mediaController.f21268e1;
                        if (audioRecord != null) {
                            mediaController.B1 = 4;
                            audioRecord.stop();
                            mediaController.f21268e1.release();
                            mediaController.f21268e1 = null;
                            p5Var.c(new xd(mediaController, this.f26472c, 1));
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
                MediaController.a(this.f26471b, this.f26472c);
                return;
        }
    }
}
