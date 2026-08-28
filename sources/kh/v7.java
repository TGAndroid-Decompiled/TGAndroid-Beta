package kh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
public final class v7 implements Runnable {
    public final int f16203a;
    public final a8 f16204b;
    public final bg.i f16205c;

    public v7(a8 a8Var, bg.i iVar, int i9) {
        this.f16203a = i9;
        this.f16204b = a8Var;
        this.f16205c = iVar;
    }

    @Override
    public final void run() {
        v7 v7Var;
        switch (this.f16203a) {
            case 0:
                bg.i iVar = this.f16205c;
                a8 a8Var = this.f16204b;
                a8Var.getClass();
                try {
                    try {
                        z7 z7Var = a8Var.f14911d1;
                        z7 z7Var2 = z7Var;
                        if (z7Var == null) {
                            ?? obj = new Object();
                            a8Var.f14911d1 = obj;
                            z7Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(a8Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            z7Var2.f16465b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            z7Var2.f16464a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        a8Var.f14911d1 = a8Var.f14911d1;
                        v7Var = new v7(a8Var, iVar, 1);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        a8Var.f14911d1 = a8Var.f14911d1;
                        v7Var = new v7(a8Var, iVar, 1);
                    }
                    AndroidUtilities.runOnUIThread(v7Var);
                    return;
                } catch (Throwable th) {
                    a8Var.f14911d1 = a8Var.f14911d1;
                    AndroidUtilities.runOnUIThread(new v7(a8Var, iVar, 1));
                    throw th;
                }
            default:
                this.f16205c.run(this.f16204b.f14911d1);
                return;
        }
    }
}
