package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
public final class d0 {
    public final Handler f12083a = new Handler(Looper.myLooper());
    public final c0 f12084b = new c0(this);
    public final e0 f12085c;

    public d0(e0 e0Var) {
        this.f12085c = e0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f12084b);
        this.f12083a.removeCallbacksAndMessages(null);
    }
}
