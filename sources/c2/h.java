package c2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class h {
    public final int f4134a;
    public final AudioManager.OnAudioFocusChangeListener f4135b;
    public final Handler f4136c;
    public final b2.f d;
    public final boolean e;
    public final Object f4137f;

    public h(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.f fVar, boolean z10, boolean z11) {
        this.f4134a = i10;
        this.f4136c = handler;
        this.d = fVar;
        this.e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f4135b = new g(onAudioFocusChangeListener, handler);
        } else {
            this.f4135b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f4137f = new AudioFocusRequest.Builder(i10).setAudioAttributes(fVar.b()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z11).build();
        } else {
            this.f4137f = null;
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
        if (this.f4134a == hVar.f4134a && this.e == hVar.e && Objects.equals(this.f4135b, hVar.f4135b) && Objects.equals(this.f4136c, hVar.f4136c) && Objects.equals(this.d, hVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4134a), this.f4135b, this.f4136c, this.d, Boolean.valueOf(this.e));
    }
}
