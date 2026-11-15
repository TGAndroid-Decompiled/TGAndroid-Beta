package f2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class g {
    public final int f10720a;
    public final AudioManager.OnAudioFocusChangeListener f10721b;
    public final Handler f10722c;
    public final e2.e d;
    public final boolean f10723e;
    public final Object f10724f;

    public g(int i7, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, e2.e eVar, boolean z10, boolean z11) {
        this.f10720a = i7;
        this.f10722c = handler;
        this.d = eVar;
        this.f10723e = z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            this.f10721b = new f(onAudioFocusChangeListener, handler);
        } else {
            this.f10721b = onAudioFocusChangeListener;
        }
        if (i10 >= 26) {
            this.f10724f = new AudioFocusRequest.Builder(i7).setAudioAttributes(eVar.b()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z11).build();
        } else {
            this.f10724f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f10720a == gVar.f10720a && this.f10723e == gVar.f10723e && Objects.equals(this.f10721b, gVar.f10721b) && Objects.equals(this.f10722c, gVar.f10722c) && Objects.equals(this.d, gVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10720a), this.f10721b, this.f10722c, this.d, Boolean.valueOf(this.f10723e));
    }
}
