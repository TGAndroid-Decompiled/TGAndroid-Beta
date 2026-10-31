package c2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class g {
    public final int f3539a;
    public final AudioManager.OnAudioFocusChangeListener f3540b;
    public final Handler f3541c;
    public final b2.f d;
    public final boolean e;
    public final Object f3542f;

    public g(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.f fVar, boolean z10, boolean z11) {
        this.f3539a = i10;
        this.f3541c = handler;
        this.d = fVar;
        this.e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f3540b = new f(onAudioFocusChangeListener, handler);
        } else {
            this.f3540b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f3542f = new AudioFocusRequest.Builder(i10).setAudioAttributes(fVar.b()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z11).build();
        } else {
            this.f3542f = null;
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
        if (this.f3539a == gVar.f3539a && this.e == gVar.e && Objects.equals(this.f3540b, gVar.f3540b) && Objects.equals(this.f3541c, gVar.f3541c) && Objects.equals(this.d, gVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3539a), this.f3540b, this.f3541c, this.d, Boolean.valueOf(this.e));
    }
}
