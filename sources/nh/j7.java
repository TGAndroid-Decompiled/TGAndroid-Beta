package nh;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
public final class j7 implements Runnable {
    public final int f17964a;
    public final o7 f17965b;
    public final b0 f17966c;

    public j7(o7 o7Var, b0 b0Var, int i10) {
        this.f17964a = i10;
        this.f17965b = o7Var;
        this.f17966c = b0Var;
    }

    @Override
    public final void run() {
        j7 j7Var;
        switch (this.f17964a) {
            case 0:
                b0 b0Var = this.f17966c;
                o7 o7Var = this.f17965b;
                o7Var.getClass();
                try {
                    try {
                        n7 n7Var = o7Var.f18264d1;
                        n7 n7Var2 = n7Var;
                        if (n7Var == null) {
                            ?? obj = new Object();
                            o7Var.f18264d1 = obj;
                            n7Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(o7Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            n7Var2.f18193b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            n7Var2.f18192a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        o7Var.f18264d1 = o7Var.f18264d1;
                        j7Var = new j7(o7Var, b0Var, 1);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        o7Var.f18264d1 = o7Var.f18264d1;
                        j7Var = new j7(o7Var, b0Var, 1);
                    }
                    AndroidUtilities.runOnUIThread(j7Var);
                    return;
                } catch (Throwable th2) {
                    o7Var.f18264d1 = o7Var.f18264d1;
                    AndroidUtilities.runOnUIThread(new j7(o7Var, b0Var, 1));
                    throw th2;
                }
            default:
                this.f17966c.run(this.f17965b.f18264d1);
                return;
        }
    }
}
