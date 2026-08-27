package lh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;

public final class u7 implements Runnable {

    public final int f16913a;

    public final z7 f16914b;

    public final n6 f16915c;

    public u7(z7 z7Var, n6 n6Var, int i10) {
        this.f16913a = i10;
        this.f16914b = z7Var;
        this.f16915c = n6Var;
    }

    @Override
    public final void run() {
        u7 u7Var;
        switch (this.f16913a) {
            case 0:
                n6 n6Var = this.f16915c;
                z7 z7Var = this.f16914b;
                z7Var.getClass();
                try {
                    try {
                        y7 y7Var = z7Var.f17203d1;
                        if (y7Var == null) {
                            y7Var = new y7();
                            z7Var.f17203d1 = y7Var;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(z7Var.L.getAbsolutePath());
                        int iFindTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(iFindTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(iFindTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            y7Var.f17121b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            y7Var.f17120a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        z7Var.f17203d1 = z7Var.f17203d1;
                        u7Var = new u7(z7Var, n6Var, 1);
                        break;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        z7Var.f17203d1 = z7Var.f17203d1;
                        u7Var = new u7(z7Var, n6Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(u7Var);
                    return;
                } catch (Throwable th) {
                    z7Var.f17203d1 = z7Var.f17203d1;
                    AndroidUtilities.runOnUIThread(new u7(z7Var, n6Var, 1));
                    throw th;
                }
            default:
                this.f16915c.run(this.f16914b.f17203d1);
                return;
        }
    }
}
