package c2;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class c {
    public final int f3660a;
    public final AudioManager.OnAudioFocusChangeListener f3661b;
    public final Handler f3662c;
    public final b2.e d;
    public final boolean e;
    public final Object f3663f;

    public c(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.e eVar, boolean z10) {
        this.f3660a = i10;
        this.f3662c = handler;
        this.d = eVar;
        this.e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f3661b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.f3661b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f3663f = new AudioFocusRequest.Builder(i10).setAudioAttributes((AudioAttributes) eVar.b().f3343a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f3663f = null;
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
        if (this.f3660a == cVar.f3660a && this.e == cVar.e && Objects.equals(this.f3661b, cVar.f3661b) && Objects.equals(this.f3662c, cVar.f3662c) && Objects.equals(this.d, cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3660a), this.f3661b, this.f3662c, this.d, Boolean.valueOf(this.e));
    }
}
