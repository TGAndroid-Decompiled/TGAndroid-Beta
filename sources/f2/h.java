package f2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class h {
    public final int f11042a;
    public final AudioManager.OnAudioFocusChangeListener f11043b;
    public final Handler f11044c;
    public final e2.e d;
    public final boolean f11045e;
    public final Object f11046f;

    public h(int i7, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, e2.e eVar, boolean z10, boolean z11) {
        this.f11042a = i7;
        this.f11044c = handler;
        this.d = eVar;
        this.f11045e = z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            this.f11043b = new g(onAudioFocusChangeListener, handler);
        } else {
            this.f11043b = onAudioFocusChangeListener;
        }
        if (i10 >= 26) {
            this.f11046f = new AudioFocusRequest.Builder(i7).setAudioAttributes(eVar.b()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z11).build();
        } else {
            this.f11046f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f11042a == hVar.f11042a && this.f11045e == hVar.f11045e && Objects.equals(this.f11043b, hVar.f11043b) && Objects.equals(this.f11044c, hVar.f11044c) && Objects.equals(this.d, hVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11042a), this.f11043b, this.f11044c, this.d, Boolean.valueOf(this.f11045e));
    }
}
