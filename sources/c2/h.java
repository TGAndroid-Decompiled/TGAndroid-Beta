package c2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class h {
    public final int f4509a;
    public final AudioManager.OnAudioFocusChangeListener f4510b;
    public final Handler f4511c;
    public final b2.f d;
    public final boolean e;
    public final Object f4512f;

    public h(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.f fVar, boolean z10, boolean z11) {
        this.f4509a = i10;
        this.f4511c = handler;
        this.d = fVar;
        this.e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f4510b = new g(onAudioFocusChangeListener, handler);
        } else {
            this.f4510b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f4512f = new AudioFocusRequest.Builder(i10).setAudioAttributes(fVar.b()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z11).build();
        } else {
            this.f4512f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f4509a == hVar.f4509a && this.e == hVar.e && Objects.equals(this.f4510b, hVar.f4510b) && Objects.equals(this.f4511c, hVar.f4511c) && Objects.equals(this.d, hVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4509a), this.f4510b, this.f4511c, this.d, Boolean.valueOf(this.e));
    }
}
