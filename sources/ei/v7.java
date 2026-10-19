package ei;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
public final class v7 implements Runnable {
    public final int f9941a;
    public final a8 f9942b;
    public final ai.r0 f9943c;

    public v7(a8 a8Var, ai.r0 r0Var, int i10) {
        this.f9941a = i10;
        this.f9942b = a8Var;
        this.f9943c = r0Var;
    }

    @Override
    public final void run() {
        v7 v7Var;
        switch (this.f9941a) {
            case 0:
                ai.r0 r0Var = this.f9943c;
                a8 a8Var = this.f9942b;
                a8Var.getClass();
                try {
                    try {
                        z7 z7Var = a8Var.f8704d1;
                        z7 z7Var2 = z7Var;
                        if (z7Var == null) {
                            ?? obj = new Object();
                            a8Var.f8704d1 = obj;
                            z7Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(a8Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            z7Var2.f10241b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            z7Var2.f10240a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        a8Var.f8704d1 = a8Var.f8704d1;
                        v7Var = new v7(a8Var, r0Var, 1);
                    } catch (Exception e) {
                        FileLog.e(e);
                        a8Var.f8704d1 = a8Var.f8704d1;
                        v7Var = new v7(a8Var, r0Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(v7Var);
                    return;
                } catch (Throwable th2) {
                    a8Var.f8704d1 = a8Var.f8704d1;
                    AndroidUtilities.runOnUIThread(new v7(a8Var, r0Var, 1));
                    throw th2;
                }
            default:
                this.f9943c.run(this.f9942b.f8704d1);
                return;
        }
    }
}
