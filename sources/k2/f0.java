package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
public final class f0 {
    public final Handler f13250a = new Handler(Looper.myLooper());
    public final e0 f13251b = new e0(this);
    public final g0 f13252c;

    public f0(g0 g0Var) {
        this.f13252c = g0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f13251b);
        this.f13250a.removeCallbacksAndMessages(null);
    }
}
