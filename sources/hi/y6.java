package hi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;
public final class y6 implements Runnable {
    public final int f15726a;
    public final d7 f15727b;
    public final ai.c0 f15728c;

    public y6(d7 d7Var, ai.c0 c0Var, int i7) {
        this.f15726a = i7;
        this.f15727b = d7Var;
        this.f15728c = c0Var;
    }

    @Override
    public final void run() {
        y6 y6Var;
        switch (this.f15726a) {
            case 0:
                ai.c0 c0Var = this.f15728c;
                d7 d7Var = this.f15727b;
                d7Var.getClass();
                try {
                    try {
                        c7 c7Var = d7Var.f14372d1;
                        c7 c7Var2 = c7Var;
                        if (c7Var == null) {
                            ?? obj = new Object();
                            d7Var.f14372d1 = obj;
                            c7Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(d7Var.L.getAbsolutePath());
                        int w10 = MediaController.w(mediaExtractor, false);
                        mediaExtractor.selectTrack(w10);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(w10);
                        if (trackFormat.containsKey("color-transfer")) {
                            c7Var2.f14277b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            c7Var2.f14276a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        d7Var.f14372d1 = d7Var.f14372d1;
                        y6Var = new y6(d7Var, c0Var, 1);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        d7Var.f14372d1 = d7Var.f14372d1;
                        y6Var = new y6(d7Var, c0Var, 1);
                    }
                    org.telegram.messenger.g0.g3(y6Var);
                    return;
                } catch (Throwable th2) {
                    d7Var.f14372d1 = d7Var.f14372d1;
                    org.telegram.messenger.g0.g3(new y6(d7Var, c0Var, 1));
                    throw th2;
                }
            default:
                this.f15728c.a(this.f15727b.f14372d1);
                return;
        }
    }
}
