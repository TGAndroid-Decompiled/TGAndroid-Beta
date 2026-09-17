package di;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
public final class j8 implements Runnable {
    public final int f7439a;
    public final o8 f7440b;
    public final bi.o1 f7441c;

    public j8(o8 o8Var, bi.o1 o1Var, int i10) {
        this.f7439a = i10;
        this.f7440b = o8Var;
        this.f7441c = o1Var;
    }

    @Override
    public final void run() {
        j8 j8Var;
        switch (this.f7439a) {
            case 0:
                bi.o1 o1Var = this.f7441c;
                o8 o8Var = this.f7440b;
                o8Var.getClass();
                try {
                    try {
                        n8 n8Var = o8Var.f7750d1;
                        n8 n8Var2 = n8Var;
                        if (n8Var == null) {
                            ?? obj = new Object();
                            o8Var.f7750d1 = obj;
                            n8Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(o8Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            n8Var2.f7691b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            n8Var2.f7690a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        o8Var.f7750d1 = o8Var.f7750d1;
                        j8Var = new j8(o8Var, o1Var, 1);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        o8Var.f7750d1 = o8Var.f7750d1;
                        j8Var = new j8(o8Var, o1Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(j8Var);
                    return;
                } catch (Throwable th2) {
                    o8Var.f7750d1 = o8Var.f7750d1;
                    AndroidUtilities.runOnUIThread(new j8(o8Var, o1Var, 1));
                    throw th2;
                }
            default:
                this.f7441c.run(this.f7440b.f7750d1);
                return;
        }
    }
}
