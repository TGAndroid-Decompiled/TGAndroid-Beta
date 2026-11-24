package defpackage;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.MediaController;
public final class a4b implements Runnable {
    public final byte a;
    public final f4b b;
    public final zf7 c;

    public a4b(f4b f4bVar, zf7 zf7Var, byte b) {
        this.a = b;
        this.b = f4bVar;
        this.c = zf7Var;
    }

    @Override
    public final void run() {
        a4b a4bVar;
        byte b = this.a;
        zf7 zf7Var = this.c;
        f4b f4bVar = this.b;
        switch (b) {
            case 0:
                f4bVar.getClass();
                try {
                    try {
                        e4b e4bVar = f4bVar.d1;
                        e4b e4bVar2 = e4bVar;
                        if (e4bVar == null) {
                            ?? obj = new Object();
                            f4bVar.d1 = obj;
                            e4bVar2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(f4bVar.L.getAbsolutePath());
                        int r = MediaController.r(mediaExtractor, false);
                        mediaExtractor.selectTrack(r);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(r);
                        if (trackFormat.containsKey("color-transfer")) {
                            e4bVar2.b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            e4bVar2.a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        f4bVar.d1 = f4bVar.d1;
                        a4bVar = new a4b(f4bVar, zf7Var, (byte) 1);
                    } catch (Exception e) {
                        fa4.g(e, true);
                        f4bVar.d1 = f4bVar.d1;
                        a4bVar = new a4b(f4bVar, zf7Var, (byte) 1);
                    }
                    gl.c3(a4bVar);
                    return;
                } catch (Throwable th) {
                    f4bVar.d1 = f4bVar.d1;
                    gl.c3(new a4b(f4bVar, zf7Var, (byte) 1));
                    throw th;
                }
            default:
                zf7Var.a(f4bVar.d1);
                return;
        }
    }
}
