package k2;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
public final class d0 {
    public final Handler f13228a = new Handler(Looper.myLooper());
    public final c0 f13229b = new c0(this);
    public final e0 f13230c;

    public d0(e0 e0Var) {
        this.f13230c = e0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f13229b);
        this.f13228a.removeCallbacksAndMessages(null);
    }
}
