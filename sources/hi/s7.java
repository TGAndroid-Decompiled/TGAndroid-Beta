package hi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;
public final class s7 implements Runnable {
    public final int f15397a;
    public final x7 f15398b;
    public final ai.d0 f15399c;

    public s7(x7 x7Var, ai.d0 d0Var, int i7) {
        this.f15397a = i7;
        this.f15398b = x7Var;
        this.f15399c = d0Var;
    }

    @Override
    public final void run() {
        s7 s7Var;
        switch (this.f15397a) {
            case 0:
                ai.d0 d0Var = this.f15399c;
                x7 x7Var = this.f15398b;
                x7Var.getClass();
                try {
                    try {
                        w7 w7Var = x7Var.f15743d1;
                        w7 w7Var2 = w7Var;
                        if (w7Var == null) {
                            ?? obj = new Object();
                            x7Var.f15743d1 = obj;
                            w7Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(x7Var.L.getAbsolutePath());
                        int w10 = MediaController.w(mediaExtractor, false);
                        mediaExtractor.selectTrack(w10);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(w10);
                        if (trackFormat.containsKey("color-transfer")) {
                            w7Var2.f15681b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            w7Var2.f15680a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        x7Var.f15743d1 = x7Var.f15743d1;
                        s7Var = new s7(x7Var, d0Var, 1);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        x7Var.f15743d1 = x7Var.f15743d1;
                        s7Var = new s7(x7Var, d0Var, 1);
                    }
                    org.telegram.messenger.g0.g3(s7Var);
                    return;
                } catch (Throwable th2) {
                    x7Var.f15743d1 = x7Var.f15743d1;
                    org.telegram.messenger.g0.g3(new s7(x7Var, d0Var, 1));
                    throw th2;
                }
            default:
                this.f15399c.a(this.f15398b.f15743d1);
                return;
        }
    }
}
