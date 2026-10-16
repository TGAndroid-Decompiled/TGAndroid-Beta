package di;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
public final class f8 implements Runnable {
    public final int f6950a;
    public final k8 f6951b;
    public final bi.o1 f6952c;

    public f8(k8 k8Var, bi.o1 o1Var, int i10) {
        this.f6950a = i10;
        this.f6951b = k8Var;
        this.f6952c = o1Var;
    }

    @Override
    public final void run() {
        f8 f8Var;
        switch (this.f6950a) {
            case 0:
                bi.o1 o1Var = this.f6952c;
                k8 k8Var = this.f6951b;
                k8Var.getClass();
                try {
                    try {
                        j8 j8Var = k8Var.f7185d1;
                        j8 j8Var2 = j8Var;
                        if (j8Var == null) {
                            ?? obj = new Object();
                            k8Var.f7185d1 = obj;
                            j8Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(k8Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            j8Var2.f7125b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            j8Var2.f7124a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        k8Var.f7185d1 = k8Var.f7185d1;
                        f8Var = new f8(k8Var, o1Var, 1);
                    } catch (Exception e) {
                        FileLog.e(e);
                        k8Var.f7185d1 = k8Var.f7185d1;
                        f8Var = new f8(k8Var, o1Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(f8Var);
                    return;
                } catch (Throwable th2) {
                    k8Var.f7185d1 = k8Var.f7185d1;
                    AndroidUtilities.runOnUIThread(new f8(k8Var, o1Var, 1));
                    throw th2;
                }
            default:
                this.f6952c.run(this.f6951b.f7185d1);
                return;
        }
    }
}
