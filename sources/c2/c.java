package c2;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class c {
    public final int f3998a;
    public final AudioManager.OnAudioFocusChangeListener f3999b;
    public final Handler f4000c;
    public final b2.e d;
    public final boolean f4001e;
    public final Object f4002f;

    public c(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.e eVar, boolean z10) {
        this.f3998a = i10;
        this.f4000c = handler;
        this.d = eVar;
        this.f4001e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f3999b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.f3999b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f4002f = new AudioFocusRequest.Builder(i10).setAudioAttributes((AudioAttributes) eVar.b().f3681a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f4002f = null;
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
        if (this.f3998a == cVar.f3998a && this.f4001e == cVar.f4001e && Objects.equals(this.f3999b, cVar.f3999b) && Objects.equals(this.f4000c, cVar.f4000c) && Objects.equals(this.d, cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3998a), this.f3999b, this.f4000c, this.d, Boolean.valueOf(this.f4001e));
    }
}
