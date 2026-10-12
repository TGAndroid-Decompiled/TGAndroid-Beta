package c2;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class c {
    public final int f3997a;
    public final AudioManager.OnAudioFocusChangeListener f3998b;
    public final Handler f3999c;
    public final b2.e d;
    public final boolean f4000e;
    public final Object f4001f;

    public c(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.e eVar, boolean z10) {
        this.f3997a = i10;
        this.f3999c = handler;
        this.d = eVar;
        this.f4000e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f3998b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.f3998b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f4001f = new AudioFocusRequest.Builder(i10).setAudioAttributes((AudioAttributes) eVar.b().f3679a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f4001f = null;
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
        if (this.f3997a == cVar.f3997a && this.f4000e == cVar.f4000e && Objects.equals(this.f3998b, cVar.f3998b) && Objects.equals(this.f3999c, cVar.f3999c) && Objects.equals(this.d, cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3997a), this.f3998b, this.f3999c, this.d, Boolean.valueOf(this.f4000e));
    }
}
