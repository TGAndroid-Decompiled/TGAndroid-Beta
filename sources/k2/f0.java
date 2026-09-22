package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
public final class f0 {
    public final Handler f13249a = new Handler(Looper.myLooper());
    public final e0 f13250b = new e0(this);
    public final g0 f13251c;

    public f0(g0 g0Var) {
        this.f13251c = g0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f13250b);
        this.f13249a.removeCallbacksAndMessages(null);
    }
}
