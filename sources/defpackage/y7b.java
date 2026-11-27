package defpackage;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;
public final class y7b implements Runnable {
    public final byte a;
    public final c8b b;
    public final ii7 c;

    public y7b(c8b c8bVar, ii7 ii7Var, byte b) {
        this.a = b;
        this.b = c8bVar;
        this.c = ii7Var;
    }

    @Override
    public final void run() {
        y7b y7bVar;
        byte b = this.a;
        ii7 ii7Var = this.c;
        c8b c8bVar = this.b;
        switch (b) {
            case 0:
                ii7Var.a(c8bVar.d1);
                return;
            default:
                c8bVar.getClass();
                try {
                    try {
                        b8b b8bVar = c8bVar.d1;
                        b8b b8bVar2 = b8bVar;
                        if (b8bVar == null) {
                            ?? obj = new Object();
                            c8bVar.d1 = obj;
                            b8bVar2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(c8bVar.L.getAbsolutePath());
                        int t = MediaController.t(mediaExtractor, false);
                        mediaExtractor.selectTrack(t);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(t);
                        if (trackFormat.containsKey("color-transfer")) {
                            b8bVar2.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            b8bVar2.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        c8bVar.d1 = c8bVar.d1;
                        y7bVar = new y7b(c8bVar, ii7Var, (byte) 0);
                    } catch (Exception e) {
                        cc4.g(e, true);
                        c8bVar.d1 = c8bVar.d1;
                        y7bVar = new y7b(c8bVar, ii7Var, (byte) 0);
                    }
                    hl.c3(y7bVar);
                    return;
                } catch (Throwable th) {
                    c8bVar.d1 = c8bVar.d1;
                    hl.c3(new y7b(c8bVar, ii7Var, (byte) 0));
                    throw th;
                }
        }
    }
}
