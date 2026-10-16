package c2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class h {
    public final int f4138a;
    public final AudioManager.OnAudioFocusChangeListener f4139b;
    public final Handler f4140c;
    public final b2.f d;
    public final boolean e;
    public final Object f4141f;

    public h(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.f fVar, boolean z10, boolean z11) {
        this.f4138a = i10;
        this.f4140c = handler;
        this.d = fVar;
        this.e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f4139b = new g(onAudioFocusChangeListener, handler);
        } else {
            this.f4139b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f4141f = new AudioFocusRequest.Builder(i10).setAudioAttributes(fVar.b()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z11).build();
        } else {
            this.f4141f = null;
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
        if (this.f4138a == hVar.f4138a && this.e == hVar.e && Objects.equals(this.f4139b, hVar.f4139b) && Objects.equals(this.f4140c, hVar.f4140c) && Objects.equals(this.d, hVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4138a), this.f4139b, this.f4140c, this.d, Boolean.valueOf(this.e));
    }
}
