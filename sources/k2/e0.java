package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
public final class e0 {
    public final Handler f14390a = new Handler(Looper.myLooper());
    public final d0 f14391b = new d0(this);
    public final f0 f14392c;

    public e0(f0 f0Var) {
        this.f14392c = f0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f14391b);
        this.f14390a.removeCallbacksAndMessages(null);
    }
}
