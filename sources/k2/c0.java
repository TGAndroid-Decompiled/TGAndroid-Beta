package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
public final class c0 {
    public final Handler f14412a = new Handler(Looper.myLooper());
    public final b0 f14413b = new b0(this);
    public final d0 f14414c;

    public c0(d0 d0Var) {
        this.f14414c = d0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f14413b);
        this.f14412a.removeCallbacksAndMessages(null);
    }
}
