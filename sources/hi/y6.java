package hi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;
public final class y6 implements Runnable {
    public final int f15424a;
    public final d7 f15425b;
    public final ai.g0 f15426c;

    public y6(d7 d7Var, ai.g0 g0Var, int i7) {
        this.f15424a = i7;
        this.f15425b = d7Var;
        this.f15426c = g0Var;
    }

    @Override
    public final void run() {
        y6 y6Var;
        switch (this.f15424a) {
            case 0:
                ai.g0 g0Var = this.f15426c;
                d7 d7Var = this.f15425b;
                d7Var.getClass();
                try {
                    try {
                        c7 c7Var = d7Var.f14133d1;
                        c7 c7Var2 = c7Var;
                        if (c7Var == null) {
                            ?? obj = new Object();
                            d7Var.f14133d1 = obj;
                            c7Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(d7Var.L.getAbsolutePath());
                        int w10 = MediaController.w(mediaExtractor, false);
                        mediaExtractor.selectTrack(w10);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(w10);
                        if (trackFormat.containsKey("color-transfer")) {
                            c7Var2.f13984b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            c7Var2.f13983a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        d7Var.f14133d1 = d7Var.f14133d1;
                        y6Var = new y6(d7Var, g0Var, 1);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        d7Var.f14133d1 = d7Var.f14133d1;
                        y6Var = new y6(d7Var, g0Var, 1);
                    }
                    org.telegram.messenger.g0.h3(y6Var);
                    return;
                } catch (Throwable th2) {
                    d7Var.f14133d1 = d7Var.f14133d1;
                    org.telegram.messenger.g0.h3(new y6(d7Var, g0Var, 1));
                    throw th2;
                }
            default:
                this.f15426c.a(this.f15425b.f14133d1);
                return;
        }
    }
}
