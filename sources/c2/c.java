package c2;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class c {
    public final int f3661a;
    public final AudioManager.OnAudioFocusChangeListener f3662b;
    public final Handler f3663c;
    public final b2.e d;
    public final boolean e;
    public final Object f3664f;

    public c(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.e eVar, boolean z10) {
        this.f3661a = i10;
        this.f3663c = handler;
        this.d = eVar;
        this.e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f3662b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.f3662b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f3664f = new AudioFocusRequest.Builder(i10).setAudioAttributes((AudioAttributes) eVar.b().f3344a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f3664f = null;
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
        if (this.f3661a == cVar.f3661a && this.e == cVar.e && Objects.equals(this.f3662b, cVar.f3662b) && Objects.equals(this.f3663c, cVar.f3663c) && Objects.equals(this.d, cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3661a), this.f3662b, this.f3663c, this.d, Boolean.valueOf(this.e));
    }
}
