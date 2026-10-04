package c2;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class c {
    public final int f3948a;
    public final AudioManager.OnAudioFocusChangeListener f3949b;
    public final Handler f3950c;
    public final b2.e d;
    public final boolean f3951e;
    public final Object f3952f;

    public c(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.e eVar, boolean z10) {
        this.f3948a = i10;
        this.f3950c = handler;
        this.d = eVar;
        this.f3951e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f3949b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.f3949b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f3952f = new AudioFocusRequest.Builder(i10).setAudioAttributes((AudioAttributes) eVar.b().f3602a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f3952f = null;
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
        if (this.f3948a == cVar.f3948a && this.f3951e == cVar.f3951e && Objects.equals(this.f3949b, cVar.f3949b) && Objects.equals(this.f3950c, cVar.f3950c) && Objects.equals(this.d, cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3948a), this.f3949b, this.f3950c, this.d, Boolean.valueOf(this.f3951e));
    }
}
