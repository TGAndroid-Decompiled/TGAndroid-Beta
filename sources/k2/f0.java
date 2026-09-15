package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
public final class f0 {
    public final Handler f13247a = new Handler(Looper.myLooper());
    public final e0 f13248b = new e0(this);
    public final g0 f13249c;

    public f0(g0 g0Var) {
        this.f13249c = g0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f13248b);
        this.f13247a.removeCallbacksAndMessages(null);
    }
}
