package c2;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class c {
    public final int f4170a;
    public final AudioManager.OnAudioFocusChangeListener f4171b;
    public final Handler f4172c;
    public final b2.e d;
    public final boolean f4173e;
    public final Object f4174f;

    public c(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.e eVar, boolean z10) {
        this.f4170a = i10;
        this.f4172c = handler;
        this.d = eVar;
        this.f4173e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f4171b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.f4171b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f4174f = new AudioFocusRequest.Builder(i10).setAudioAttributes((AudioAttributes) eVar.b().f2435a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f4174f = null;
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
        if (this.f4170a == cVar.f4170a && this.f4173e == cVar.f4173e && Objects.equals(this.f4171b, cVar.f4171b) && Objects.equals(this.f4172c, cVar.f4172c) && Objects.equals(this.d, cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4170a), this.f4171b, this.f4172c, this.d, Boolean.valueOf(this.f4173e));
    }
}
