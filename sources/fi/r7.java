package fi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
public final class r7 implements Runnable {
    public final int f11554a;
    public final w7 f11555b;
    public final ai.i f11556c;

    public r7(w7 w7Var, ai.i iVar, int i10) {
        this.f11554a = i10;
        this.f11555b = w7Var;
        this.f11556c = iVar;
    }

    @Override
    public final void run() {
        r7 r7Var;
        switch (this.f11554a) {
            case 0:
                ai.i iVar = this.f11556c;
                w7 w7Var = this.f11555b;
                w7Var.getClass();
                try {
                    try {
                        v7 v7Var = w7Var.f11897d1;
                        v7 v7Var2 = v7Var;
                        if (v7Var == null) {
                            ?? obj = new Object();
                            w7Var.f11897d1 = obj;
                            v7Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(w7Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            v7Var2.f11823b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            v7Var2.f11822a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        w7Var.f11897d1 = w7Var.f11897d1;
                        r7Var = new r7(w7Var, iVar, 1);
                    } catch (Exception e) {
                        FileLog.e(e);
                        w7Var.f11897d1 = w7Var.f11897d1;
                        r7Var = new r7(w7Var, iVar, 1);
                    }
                    AndroidUtilities.runOnUIThread(r7Var);
                    return;
                } catch (Throwable th2) {
                    w7Var.f11897d1 = w7Var.f11897d1;
                    AndroidUtilities.runOnUIThread(new r7(w7Var, iVar, 1));
                    throw th2;
                }
            default:
                this.f11556c.run(this.f11555b.f11897d1);
                return;
        }
    }
}
