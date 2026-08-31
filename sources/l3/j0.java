package l3;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
public final class j0 {
    public final Handler f11521a = new Handler(Looper.myLooper());
    public final i0 f11522b = new i0(this);
    public final k0 f11523c;

    public j0(k0 k0Var) {
        this.f11523c = k0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f11522b);
        this.f11521a.removeCallbacksAndMessages(null);
    }
}
