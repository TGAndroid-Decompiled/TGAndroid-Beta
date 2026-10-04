package c2;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class c {
    public final int f3949a;
    public final AudioManager.OnAudioFocusChangeListener f3950b;
    public final Handler f3951c;
    public final b2.e d;
    public final boolean f3952e;
    public final Object f3953f;

    public c(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.e eVar, boolean z10) {
        this.f3949a = i10;
        this.f3951c = handler;
        this.d = eVar;
        this.f3952e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f3950b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.f3950b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f3953f = new AudioFocusRequest.Builder(i10).setAudioAttributes((AudioAttributes) eVar.b().f3602a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f3953f = null;
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
        if (this.f3949a == cVar.f3949a && this.f3952e == cVar.f3952e && Objects.equals(this.f3950b, cVar.f3950b) && Objects.equals(this.f3951c, cVar.f3951c) && Objects.equals(this.d, cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3949a), this.f3950b, this.f3951c, this.d, Boolean.valueOf(this.f3952e));
    }
}
