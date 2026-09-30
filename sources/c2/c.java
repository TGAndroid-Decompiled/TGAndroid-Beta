package c2;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class c {
    public final int f3653a;
    public final AudioManager.OnAudioFocusChangeListener f3654b;
    public final Handler f3655c;
    public final b2.e d;
    public final boolean e;
    public final Object f3656f;

    public c(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.e eVar, boolean z10) {
        this.f3653a = i10;
        this.f3655c = handler;
        this.d = eVar;
        this.e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f3654b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.f3654b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f3656f = new AudioFocusRequest.Builder(i10).setAudioAttributes((AudioAttributes) eVar.b().f3336a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f3656f = null;
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
        if (this.f3653a == cVar.f3653a && this.e == cVar.e && Objects.equals(this.f3654b, cVar.f3654b) && Objects.equals(this.f3655c, cVar.f3655c) && Objects.equals(this.d, cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3653a), this.f3654b, this.f3655c, this.d, Boolean.valueOf(this.e));
    }
}
