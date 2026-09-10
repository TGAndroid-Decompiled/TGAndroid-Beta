package bi;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
public final class m9 implements Runnable {
    public final int f3139a;
    public final r9 f3140b;
    public final ai.b f3141c;

    public m9(r9 r9Var, ai.b bVar, int i10) {
        this.f3139a = i10;
        this.f3140b = r9Var;
        this.f3141c = bVar;
    }

    @Override
    public final void run() {
        m9 m9Var;
        switch (this.f3139a) {
            case 0:
                ai.b bVar = this.f3141c;
                r9 r9Var = this.f3140b;
                r9Var.getClass();
                try {
                    try {
                        q9 q9Var = r9Var.f3569d1;
                        q9 q9Var2 = q9Var;
                        if (q9Var == null) {
                            ?? obj = new Object();
                            r9Var.f3569d1 = obj;
                            q9Var2 = obj;
                        }
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        mediaExtractor.setDataSource(r9Var.L.getAbsolutePath());
                        int findTrack = MediaController.findTrack(mediaExtractor, false);
                        mediaExtractor.selectTrack(findTrack);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
                        if (trackFormat.containsKey("color-transfer")) {
                            q9Var2.f3464b = trackFormat.getInteger("color-transfer");
                        }
                        if (trackFormat.containsKey("color-standard")) {
                            q9Var2.f3463a = trackFormat.getInteger("color-standard");
                        }
                        if (trackFormat.containsKey("color-range")) {
                            trackFormat.getInteger("color-range");
                        }
                        r9Var.f3569d1 = r9Var.f3569d1;
                        m9Var = new m9(r9Var, bVar, 1);
                    } catch (Exception e) {
                        FileLog.e(e);
                        r9Var.f3569d1 = r9Var.f3569d1;
                        m9Var = new m9(r9Var, bVar, 1);
                    }
                    AndroidUtilities.runOnUIThread(m9Var);
                    return;
                } catch (Throwable th2) {
                    r9Var.f3569d1 = r9Var.f3569d1;
                    AndroidUtilities.runOnUIThread(new m9(r9Var, bVar, 1));
                    throw th2;
                }
            default:
                this.f3141c.run(this.f3140b.f3569d1);
                return;
        }
    }
}
