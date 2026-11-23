package f2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class h {
    public final int f11034a;
    public final AudioManager.OnAudioFocusChangeListener f11035b;
    public final Handler f11036c;
    public final e2.e d;
    public final boolean f11037e;
    public final Object f11038f;

    public h(int i7, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, e2.e eVar, boolean z10, boolean z11) {
        this.f11034a = i7;
        this.f11036c = handler;
        this.d = eVar;
        this.f11037e = z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            this.f11035b = new g(onAudioFocusChangeListener, handler);
        } else {
            this.f11035b = onAudioFocusChangeListener;
        }
        if (i10 >= 26) {
            this.f11038f = new AudioFocusRequest.Builder(i7).setAudioAttributes(eVar.b()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z11).build();
        } else {
            this.f11038f = null;
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
        if (this.f11034a == hVar.f11034a && this.f11037e == hVar.f11037e && Objects.equals(this.f11035b, hVar.f11035b) && Objects.equals(this.f11036c, hVar.f11036c) && Objects.equals(this.d, hVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11034a), this.f11035b, this.f11036c, this.d, Boolean.valueOf(this.f11037e));
    }
}
