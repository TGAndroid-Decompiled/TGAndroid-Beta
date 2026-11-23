package f2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class h {
    public final int f11071a;
    public final AudioManager.OnAudioFocusChangeListener f11072b;
    public final Handler f11073c;
    public final e2.e d;
    public final boolean f11074e;
    public final Object f11075f;

    public h(int i7, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, e2.e eVar, boolean z10, boolean z11) {
        this.f11071a = i7;
        this.f11073c = handler;
        this.d = eVar;
        this.f11074e = z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            this.f11072b = new g(onAudioFocusChangeListener, handler);
        } else {
            this.f11072b = onAudioFocusChangeListener;
        }
        if (i10 >= 26) {
            this.f11075f = new AudioFocusRequest.Builder(i7).setAudioAttributes(eVar.b()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z11).build();
        } else {
            this.f11075f = null;
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
        if (this.f11071a == hVar.f11071a && this.f11074e == hVar.f11074e && Objects.equals(this.f11072b, hVar.f11072b) && Objects.equals(this.f11073c, hVar.f11073c) && Objects.equals(this.d, hVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11071a), this.f11072b, this.f11073c, this.d, Boolean.valueOf(this.f11074e));
    }
}
