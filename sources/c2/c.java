package c2;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class c {
    public final int f3658a;
    public final AudioManager.OnAudioFocusChangeListener f3659b;
    public final Handler f3660c;
    public final b2.e d;
    public final boolean e;
    public final Object f3661f;

    public c(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.e eVar, boolean z10) {
        this.f3658a = i10;
        this.f3660c = handler;
        this.d = eVar;
        this.e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f3659b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.f3659b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f3661f = new AudioFocusRequest.Builder(i10).setAudioAttributes((AudioAttributes) eVar.b().f3341a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f3661f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3658a == cVar.f3658a && this.e == cVar.e && Objects.equals(this.f3659b, cVar.f3659b) && Objects.equals(this.f3660c, cVar.f3660c) && Objects.equals(this.d, cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3658a), this.f3659b, this.f3660c, this.d, Boolean.valueOf(this.e));
    }
}
