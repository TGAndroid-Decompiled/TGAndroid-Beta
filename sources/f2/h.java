package f2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class h {
    public final int f11068a;
    public final AudioManager.OnAudioFocusChangeListener f11069b;
    public final Handler f11070c;
    public final e2.e d;
    public final boolean f11071e;
    public final Object f11072f;

    public h(int i7, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, e2.e eVar, boolean z10, boolean z11) {
        this.f11068a = i7;
        this.f11070c = handler;
        this.d = eVar;
        this.f11071e = z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            this.f11069b = new g(onAudioFocusChangeListener, handler);
        } else {
            this.f11069b = onAudioFocusChangeListener;
        }
        if (i10 >= 26) {
            this.f11072f = new AudioFocusRequest.Builder(i7).setAudioAttributes(eVar.b()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z11).build();
        } else {
            this.f11072f = null;
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
        if (this.f11068a == hVar.f11068a && this.f11071e == hVar.f11071e && Objects.equals(this.f11069b, hVar.f11069b) && Objects.equals(this.f11070c, hVar.f11070c) && Objects.equals(this.d, hVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11068a), this.f11069b, this.f11070c, this.d, Boolean.valueOf(this.f11071e));
    }
}
