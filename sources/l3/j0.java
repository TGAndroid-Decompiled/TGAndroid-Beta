package l3;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
public final class j0 {
    public final Handler f11157a = new Handler(Looper.myLooper());
    public final i0 f11158b = new i0(this);
    public final k0 f11159c;

    public j0(k0 k0Var) {
        this.f11159c = k0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f11158b);
        this.f11157a.removeCallbacksAndMessages(null);
    }
}
