package c2;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class c {
    public final int f4075a;
    public final AudioManager.OnAudioFocusChangeListener f4076b;
    public final Handler f4077c;
    public final b2.e d;
    public final boolean e;
    public final Object f4078f;

    public c(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.e eVar, boolean z10) {
        this.f4075a = i10;
        this.f4077c = handler;
        this.d = eVar;
        this.e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f4076b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.f4076b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f4078f = new AudioFocusRequest.Builder(i10).setAudioAttributes((AudioAttributes) eVar.b().f2037a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f4078f = null;
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
        if (this.f4075a == cVar.f4075a && this.e == cVar.e && Objects.equals(this.f4076b, cVar.f4076b) && Objects.equals(this.f4077c, cVar.f4077c) && Objects.equals(this.d, cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4075a), this.f4076b, this.f4077c, this.d, Boolean.valueOf(this.e));
    }
}
