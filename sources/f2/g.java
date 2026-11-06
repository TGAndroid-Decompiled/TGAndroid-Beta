package f2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class g {
    public final int f10904a;
    public final AudioManager.OnAudioFocusChangeListener f10905b;
    public final Handler f10906c;
    public final e2.e d;
    public final boolean f10907e;
    public final Object f10908f;

    public g(int i7, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, e2.e eVar, boolean z9, boolean z10) {
        this.f10904a = i7;
        this.f10906c = handler;
        this.d = eVar;
        this.f10907e = z9;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            this.f10905b = new f(onAudioFocusChangeListener, handler);
        } else {
            this.f10905b = onAudioFocusChangeListener;
        }
        if (i10 >= 26) {
            this.f10908f = new AudioFocusRequest.Builder(i7).setAudioAttributes(eVar.b()).setWillPauseWhenDucked(z9).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z10).build();
        } else {
            this.f10908f = null;
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
        if (this.f10904a == gVar.f10904a && this.f10907e == gVar.f10907e && Objects.equals(this.f10905b, gVar.f10905b) && Objects.equals(this.f10906c, gVar.f10906c) && Objects.equals(this.d, gVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10904a), this.f10905b, this.f10906c, this.d, Boolean.valueOf(this.f10907e));
    }
}
