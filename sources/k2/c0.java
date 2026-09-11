package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
public final class c0 {
    public final Handler f14522a = new Handler(Looper.myLooper());
    public final b0 f14523b = new b0(this);
    public final d0 f14524c;

    public c0(d0 d0Var) {
        this.f14524c = d0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f14523b);
        this.f14522a.removeCallbacksAndMessages(null);
    }
}
