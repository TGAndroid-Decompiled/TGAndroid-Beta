package c2;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class c {
    public final int f4143a;
    public final AudioManager.OnAudioFocusChangeListener f4144b;
    public final Handler f4145c;
    public final b2.e d;
    public final boolean f4146e;
    public final Object f4147f;

    public c(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.e eVar, boolean z10) {
        this.f4143a = i10;
        this.f4145c = handler;
        this.d = eVar;
        this.f4146e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f4144b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.f4144b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f4147f = new AudioFocusRequest.Builder(i10).setAudioAttributes((AudioAttributes) eVar.b().f2408a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f4147f = null;
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
        if (this.f4143a == cVar.f4143a && this.f4146e == cVar.f4146e && Objects.equals(this.f4144b, cVar.f4144b) && Objects.equals(this.f4145c, cVar.f4145c) && Objects.equals(this.d, cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4143a), this.f4144b, this.f4145c, this.d, Boolean.valueOf(this.f4146e));
    }
}
