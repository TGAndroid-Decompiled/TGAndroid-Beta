package ci;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
public final class g8 implements Runnable {
    public final int f4727a;
    public final l8 f4728b;
    public final ai.y1 f4729c;

    public g8(l8 l8Var, ai.y1 y1Var, int i10) {
        this.f4727a = i10;
        this.f4728b = l8Var;
        this.f4729c = y1Var;
    }

    @Override
    public final void run() {
        g8 g8Var;
        switch (this.f4727a) {
            case 0:
                ai.y1 y1Var = this.f4729c;
                l8 l8Var = this.f4728b;
                l8Var.getClass();
                try {
                    try {
                        k8 k8Var = l8Var.f4974d1;
                        k8 k8Var2 = k8Var;
                        if (k8Var == null) {
                            ?? obj = new Object();
                            l8Var.f4974d1 = obj;
                            k8Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(l8Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            k8Var2.f4903b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            k8Var2.f4902a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        l8Var.f4974d1 = l8Var.f4974d1;
                        g8Var = new g8(l8Var, y1Var, 1);
                    } catch (Exception e) {
                        FileLog.e(e);
                        l8Var.f4974d1 = l8Var.f4974d1;
                        g8Var = new g8(l8Var, y1Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(g8Var);
                    return;
                } catch (Throwable th2) {
                    l8Var.f4974d1 = l8Var.f4974d1;
                    AndroidUtilities.runOnUIThread(new g8(l8Var, y1Var, 1));
                    throw th2;
                }
            default:
                this.f4729c.run(this.f4728b.f4974d1);
                return;
        }
    }
}
