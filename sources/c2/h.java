package c2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class h {
    public final int f4508a;
    public final AudioManager.OnAudioFocusChangeListener f4509b;
    public final Handler f4510c;
    public final b2.f d;
    public final boolean e;
    public final Object f4511f;

    public h(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, b2.f fVar, boolean z10, boolean z11) {
        this.f4508a = i10;
        this.f4510c = handler;
        this.d = fVar;
        this.e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f4509b = new g(onAudioFocusChangeListener, handler);
        } else {
            this.f4509b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f4511f = new AudioFocusRequest.Builder(i10).setAudioAttributes(fVar.b()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z11).build();
        } else {
            this.f4511f = null;
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
        if (this.f4508a == hVar.f4508a && this.e == hVar.e && Objects.equals(this.f4509b, hVar.f4509b) && Objects.equals(this.f4510c, hVar.f4510c) && Objects.equals(this.d, hVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4508a), this.f4509b, this.f4510c, this.d, Boolean.valueOf(this.e));
    }
}
