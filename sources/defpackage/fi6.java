package defpackage;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;
public final class fi6 {
    public final HashSet a = new HashSet();
    public LoudnessCodecController b;

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.b;
        if (loudnessCodecController != null && !loudnessCodecController.addMediaCodec(mediaCodec)) {
            return;
        }
        yve.p(this.a.add(mediaCodec));
    }

    public final void b() {
        this.a.clear();
        LoudnessCodecController loudnessCodecController = this.b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.a.remove(mediaCodec) && (loudnessCodecController = this.b) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public final void d(int i) {
        LoudnessCodecController loudnessCodecController = this.b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.b = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i, mo3.a, (LoudnessCodecController$OnLoudnessCodecUpdateListener) new Object());
        this.b = create;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
