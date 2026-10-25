package c2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class h {
    public final int f5945a;
    public final AudioManager.OnAudioFocusChangeListener f5946b;
    public final Handler f5947c;
    public final b2.f d;
    public final boolean e;
    public final Object f5948f;

    public h(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.f fVar, boolean z10, boolean z11) {
        this.f5945a = i10;
        this.f5947c = handler;
        this.d = fVar;
        this.e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f5946b = new g(onAudioFocusChangeListener, handler);
        } else {
            this.f5946b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f5948f = new AudioFocusRequest.Builder(i10).setAudioAttributes(fVar.b()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z11).build();
        } else {
            this.f5948f = null;
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
        if (this.f5945a == hVar.f5945a && this.e == hVar.e && Objects.equals(this.f5946b, hVar.f5946b) && Objects.equals(this.f5947c, hVar.f5947c) && Objects.equals(this.d, hVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5945a), this.f5946b, this.f5947c, this.d, Boolean.valueOf(this.e));
    }
}
