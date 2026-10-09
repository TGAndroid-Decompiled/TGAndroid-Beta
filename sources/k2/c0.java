package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
public final class c0 {
    public final Handler f14415a = new Handler(Looper.myLooper());
    public final b0 f14416b = new b0(this);
    public final d0 f14417c;

    public c0(d0 d0Var) {
        this.f14417c = d0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f14416b);
        this.f14415a.removeCallbacksAndMessages(null);
    }
}
