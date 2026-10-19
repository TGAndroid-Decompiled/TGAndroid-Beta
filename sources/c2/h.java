package c2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class h {
    public final int f4505a;
    public final AudioManager.OnAudioFocusChangeListener f4506b;
    public final Handler f4507c;
    public final b2.f d;
    public final boolean e;
    public final Object f4508f;

    public h(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.f fVar, boolean z10, boolean z11) {
        this.f4505a = i10;
        this.f4507c = handler;
        this.d = fVar;
        this.e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f4506b = new g(onAudioFocusChangeListener, handler);
        } else {
            this.f4506b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f4508f = new AudioFocusRequest.Builder(i10).setAudioAttributes(fVar.b()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z11).build();
        } else {
            this.f4508f = null;
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
        if (this.f4505a == hVar.f4505a && this.e == hVar.e && Objects.equals(this.f4506b, hVar.f4506b) && Objects.equals(this.f4507c, hVar.f4507c) && Objects.equals(this.d, hVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4505a), this.f4506b, this.f4507c, this.d, Boolean.valueOf(this.e));
    }
}
