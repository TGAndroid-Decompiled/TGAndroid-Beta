package gi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;
public final class a7 implements Runnable {
    public final int f12393a;
    public final f7 f12394b;
    public final ai.v2 f12395c;

    public a7(f7 f7Var, ai.v2 v2Var, int i3) {
        this.f12393a = i3;
        this.f12394b = f7Var;
        this.f12395c = v2Var;
    }

    @Override
    public final void run() {
        a7 a7Var;
        switch (this.f12393a) {
            case 0:
                ai.v2 v2Var = this.f12395c;
                f7 f7Var = this.f12394b;
                f7Var.getClass();
                try {
                    try {
                        e7 e7Var = f7Var.f12712d1;
                        e7 e7Var2 = e7Var;
                        if (e7Var == null) {
                            ?? obj = new Object();
                            f7Var.f12712d1 = obj;
                            e7Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(f7Var.L.getAbsolutePath());
                        int w10 = MediaController.w(mediaExtractor, false);
                        mediaExtractor.selectTrack(w10);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(w10);
                        if (trackFormat.containsKey("color-transfer")) {
                            e7Var2.f12665b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            e7Var2.f12664a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        f7Var.f12712d1 = f7Var.f12712d1;
                        a7Var = new a7(f7Var, v2Var, 1);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        f7Var.f12712d1 = f7Var.f12712d1;
                        a7Var = new a7(f7Var, v2Var, 1);
                    }
                    org.telegram.messenger.g0.h3(a7Var);
                    return;
                } catch (Throwable th2) {
                    f7Var.f12712d1 = f7Var.f12712d1;
                    org.telegram.messenger.g0.h3(new a7(f7Var, v2Var, 1));
                    throw th2;
                }
            default:
                this.f12395c.a(this.f12394b.f12712d1);
                return;
        }
    }
}
