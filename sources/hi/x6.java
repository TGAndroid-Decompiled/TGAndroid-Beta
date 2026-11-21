package hi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;
public final class x6 implements Runnable {
    public final int f15750a;
    public final c7 f15751b;
    public final ai.h0 f15752c;

    public x6(c7 c7Var, ai.h0 h0Var, int i7) {
        this.f15750a = i7;
        this.f15751b = c7Var;
        this.f15752c = h0Var;
    }

    @Override
    public final void run() {
        x6 x6Var;
        switch (this.f15750a) {
            case 0:
                ai.h0 h0Var = this.f15752c;
                c7 c7Var = this.f15751b;
                c7Var.getClass();
                try {
                    try {
                        b7 b7Var = c7Var.f14345d1;
                        b7 b7Var2 = b7Var;
                        if (b7Var == null) {
                            ?? obj = new Object();
                            c7Var.f14345d1 = obj;
                            b7Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(c7Var.L.getAbsolutePath());
                        int w10 = MediaController.w(mediaExtractor, false);
                        mediaExtractor.selectTrack(w10);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(w10);
                        if (trackFormat.containsKey("color-transfer")) {
                            b7Var2.f14294b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            b7Var2.f14293a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        c7Var.f14345d1 = c7Var.f14345d1;
                        x6Var = new x6(c7Var, h0Var, 1);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        c7Var.f14345d1 = c7Var.f14345d1;
                        x6Var = new x6(c7Var, h0Var, 1);
                    }
                    org.telegram.messenger.g0.g3(x6Var);
                    return;
                } catch (Throwable th2) {
                    c7Var.f14345d1 = c7Var.f14345d1;
                    org.telegram.messenger.g0.g3(new x6(c7Var, h0Var, 1));
                    throw th2;
                }
            default:
                this.f15752c.a(this.f15751b.f14345d1);
                return;
        }
    }
}
