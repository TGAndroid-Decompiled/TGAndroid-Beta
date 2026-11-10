package fi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;
public final class z6 implements Runnable {
    public final int f13250a;
    public final e7 f13251b;
    public final ai.i f13252c;

    public z6(e7 e7Var, ai.i iVar, int i7) {
        this.f13250a = i7;
        this.f13251b = e7Var;
        this.f13252c = iVar;
    }

    @Override
    public final void run() {
        z6 z6Var;
        switch (this.f13250a) {
            case 0:
                ai.i iVar = this.f13252c;
                e7 e7Var = this.f13251b;
                e7Var.getClass();
                try {
                    try {
                        d7 d7Var = e7Var.f11890d1;
                        d7 d7Var2 = d7Var;
                        if (d7Var == null) {
                            ?? obj = new Object();
                            e7Var.f11890d1 = obj;
                            d7Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(e7Var.L.getAbsolutePath());
                        int w10 = MediaController.w(mediaExtractor, false);
                        mediaExtractor.selectTrack(w10);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(w10);
                        if (trackFormat.containsKey("color-transfer")) {
                            d7Var2.f11797b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            d7Var2.f11796a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        e7Var.f11890d1 = e7Var.f11890d1;
                        z6Var = new z6(e7Var, iVar, 1);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        e7Var.f11890d1 = e7Var.f11890d1;
                        z6Var = new z6(e7Var, iVar, 1);
                    }
                    org.telegram.messenger.g0.h3(z6Var);
                    return;
                } catch (Throwable th2) {
                    e7Var.f11890d1 = e7Var.f11890d1;
                    org.telegram.messenger.g0.h3(new z6(e7Var, iVar, 1));
                    throw th2;
                }
            default:
                this.f13252c.a(this.f13251b.f11890d1);
                return;
        }
    }
}
