package l3;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
public final class j0 {
    public final Handler f14107a = new Handler(Looper.myLooper());
    public final i0 f14108b = new i0(this);
    public final k0 f14109c;

    public j0(k0 k0Var) {
        this.f14109c = k0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f14108b);
        this.f14107a.removeCallbacksAndMessages(null);
    }
}
