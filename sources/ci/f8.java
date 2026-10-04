package ci;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
public final class f8 implements Runnable {
    public final int f5081a;
    public final k8 f5082b;
    public final ai.y1 f5083c;

    public f8(k8 k8Var, ai.y1 y1Var, int i10) {
        this.f5081a = i10;
        this.f5082b = k8Var;
        this.f5083c = y1Var;
    }

    @Override
    public final void run() {
        f8 f8Var;
        switch (this.f5081a) {
            case 0:
                ai.y1 y1Var = this.f5083c;
                k8 k8Var = this.f5082b;
                k8Var.getClass();
                try {
                    try {
                        j8 j8Var = k8Var.f5319d1;
                        j8 j8Var2 = j8Var;
                        if (j8Var == null) {
                            ?? obj = new Object();
                            k8Var.f5319d1 = obj;
                            j8Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(k8Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            j8Var2.f5252b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            j8Var2.f5251a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        k8Var.f5319d1 = k8Var.f5319d1;
                        f8Var = new f8(k8Var, y1Var, 1);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        k8Var.f5319d1 = k8Var.f5319d1;
                        f8Var = new f8(k8Var, y1Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(f8Var);
                    return;
                } catch (Throwable th2) {
                    k8Var.f5319d1 = k8Var.f5319d1;
                    AndroidUtilities.runOnUIThread(new f8(k8Var, y1Var, 1));
                    throw th2;
                }
            default:
                this.f5083c.run(this.f5082b.f5319d1);
                return;
        }
    }
}
