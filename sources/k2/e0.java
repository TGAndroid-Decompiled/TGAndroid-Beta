package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
public final class e0 {
    public final Handler f14389a = new Handler(Looper.myLooper());
    public final d0 f14390b = new d0(this);
    public final f0 f14391c;

    public e0(f0 f0Var) {
        this.f14391c = f0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f14390b);
        this.f14389a.removeCallbacksAndMessages(null);
    }
}
