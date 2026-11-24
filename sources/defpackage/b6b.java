package defpackage;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;
public final class b6b implements Runnable {
    public final byte a;
    public final g6b b;
    public final ci7 c;

    public b6b(g6b g6bVar, ci7 ci7Var, byte b) {
        this.a = b;
        this.b = g6bVar;
        this.c = ci7Var;
    }

    @Override
    public final void run() {
        b6b b6bVar;
        byte b = this.a;
        ci7 ci7Var = this.c;
        g6b g6bVar = this.b;
        switch (b) {
            case 0:
                g6bVar.getClass();
                try {
                    try {
                        f6b f6bVar = g6bVar.d1;
                        f6b f6bVar2 = f6bVar;
                        if (f6bVar == null) {
                            ?? obj = new Object();
                            g6bVar.d1 = obj;
                            f6bVar2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(g6bVar.L.getAbsolutePath());
                        int r = MediaController.r(mediaExtractor, false);
                        mediaExtractor.selectTrack(r);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(r);
                        if (trackFormat.containsKey("color-transfer")) {
                            f6bVar2.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            f6bVar2.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        g6bVar.d1 = g6bVar.d1;
                        b6bVar = new b6b(g6bVar, ci7Var, (byte) 1);
                    } catch (Exception e) {
                        fc4.g(e, true);
                        g6bVar.d1 = g6bVar.d1;
                        b6bVar = new b6b(g6bVar, ci7Var, (byte) 1);
                    }
                    gm.c3(b6bVar);
                    return;
                } catch (Throwable th) {
                    g6bVar.d1 = g6bVar.d1;
                    gm.c3(new b6b(g6bVar, ci7Var, (byte) 1));
                    throw th;
                }
            default:
                ci7Var.a(g6bVar.d1);
                return;
        }
    }
}
