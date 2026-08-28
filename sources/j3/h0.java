package j3;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
public final class h0 {
    public final Handler f13250a = new Handler(Looper.myLooper());
    public final g0 f13251b = new g0(this);
    public final i0 f13252c;

    public h0(i0 i0Var) {
        this.f13252c = i0Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f13251b);
        this.f13250a.removeCallbacksAndMessages(null);
    }
}
