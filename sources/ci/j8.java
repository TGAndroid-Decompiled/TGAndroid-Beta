package ci;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
public final class j8 implements Runnable {
    public final int f4853a;
    public final o8 f4854b;
    public final ai.y1 f4855c;

    public j8(o8 o8Var, ai.y1 y1Var, int i10) {
        this.f4853a = i10;
        this.f4854b = o8Var;
        this.f4855c = y1Var;
    }

    @Override
    public final void run() {
        j8 j8Var;
        switch (this.f4853a) {
            case 0:
                ai.y1 y1Var = this.f4855c;
                o8 o8Var = this.f4854b;
                o8Var.getClass();
                try {
                    try {
                        n8 n8Var = o8Var.f5153d1;
                        n8 n8Var2 = n8Var;
                        if (n8Var == null) {
                            ?? obj = new Object();
                            o8Var.f5153d1 = obj;
                            n8Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(o8Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            n8Var2.f5079b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            n8Var2.f5078a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        o8Var.f5153d1 = o8Var.f5153d1;
                        j8Var = new j8(o8Var, y1Var, 1);
                    } catch (Exception e) {
                        FileLog.e(e);
                        o8Var.f5153d1 = o8Var.f5153d1;
                        j8Var = new j8(o8Var, y1Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(j8Var);
                    return;
                } catch (Throwable th2) {
                    o8Var.f5153d1 = o8Var.f5153d1;
                    AndroidUtilities.runOnUIThread(new j8(o8Var, y1Var, 1));
                    throw th2;
                }
            default:
                this.f4855c.run(this.f4854b.f5153d1);
                return;
        }
    }
}
