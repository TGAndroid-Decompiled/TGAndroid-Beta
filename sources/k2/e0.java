package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
public final class e0 {
    public final Handler f13233a = new Handler(Looper.myLooper());
    public final d0 f13234b = new d0(this);
    public final f0 f13235c;

    public e0(f0 f0Var) {
        this.f13235c = f0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f13234b);
        this.f13233a.removeCallbacksAndMessages(null);
    }
}
