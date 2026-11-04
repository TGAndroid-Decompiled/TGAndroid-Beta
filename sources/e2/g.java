package e2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class g {
    public final int f9343a;
    public final AudioManager.OnAudioFocusChangeListener f9344b;
    public final Handler f9345c;
    public final d2.f d;
    public final boolean f9346e;
    public final Object f9347f;

    public g(int i3, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, d2.f fVar, boolean z10, boolean z11) {
        this.f9343a = i3;
        this.f9345c = handler;
        this.d = fVar;
        this.f9346e = z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            this.f9344b = new f(onAudioFocusChangeListener, handler);
        } else {
            this.f9344b = onAudioFocusChangeListener;
        }
        if (i10 >= 26) {
            this.f9347f = new AudioFocusRequest.Builder(i3).setAudioAttributes(fVar.b()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z11).build();
        } else {
            this.f9347f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f9343a == gVar.f9343a && this.f9346e == gVar.f9346e && Objects.equals(this.f9344b, gVar.f9344b) && Objects.equals(this.f9345c, gVar.f9345c) && Objects.equals(this.d, gVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f9343a), this.f9344b, this.f9345c, this.d, Boolean.valueOf(this.f9346e));
    }
}
