package j3;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

public final class i0 {

    public final Handler f12347a = new Handler(Looper.myLooper());

    public final h0 f12348b = new h0(this);

    public final j0 f12349c;

    public i0(j0 j0Var) {
        this.f12349c = j0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f12348b);
        this.f12347a.removeCallbacksAndMessages(null);
    }
}
