package f2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class g {
    public final int f10909a;
    public final AudioManager.OnAudioFocusChangeListener f10910b;
    public final Handler f10911c;
    public final e2.e d;
    public final boolean f10912e;
    public final Object f10913f;

    public g(int i7, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, e2.e eVar, boolean z9, boolean z10) {
        this.f10909a = i7;
        this.f10911c = handler;
        this.d = eVar;
        this.f10912e = z9;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            this.f10910b = new f(onAudioFocusChangeListener, handler);
        } else {
            this.f10910b = onAudioFocusChangeListener;
        }
        if (i10 >= 26) {
            this.f10913f = new AudioFocusRequest.Builder(i7).setAudioAttributes(eVar.b()).setWillPauseWhenDucked(z9).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z10).build();
        } else {
            this.f10913f = null;
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
        if (this.f10909a == gVar.f10909a && this.f10912e == gVar.f10912e && Objects.equals(this.f10910b, gVar.f10910b) && Objects.equals(this.f10911c, gVar.f10911c) && Objects.equals(this.d, gVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10909a), this.f10910b, this.f10911c, this.d, Boolean.valueOf(this.f10912e));
    }
}
