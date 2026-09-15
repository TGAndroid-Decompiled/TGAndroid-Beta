package c2;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class c {
    public final int f3656a;
    public final AudioManager.OnAudioFocusChangeListener f3657b;
    public final Handler f3658c;
    public final b2.e d;
    public final boolean e;
    public final Object f3659f;

    public c(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.e eVar, boolean z10) {
        this.f3656a = i10;
        this.f3658c = handler;
        this.d = eVar;
        this.e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f3657b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.f3657b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f3659f = new AudioFocusRequest.Builder(i10).setAudioAttributes((AudioAttributes) eVar.b().f3339a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f3659f = null;
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
        if (this.f3656a == cVar.f3656a && this.e == cVar.e && Objects.equals(this.f3657b, cVar.f3657b) && Objects.equals(this.f3658c, cVar.f3658c) && Objects.equals(this.d, cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3656a), this.f3657b, this.f3658c, this.d, Boolean.valueOf(this.e));
    }
}
