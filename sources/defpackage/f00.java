package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class f00 {
    public final byte a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final nz d;
    public final boolean e;
    public final Object f;

    public f00(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, nz nzVar, boolean z, boolean z2) {
        this.a = i;
        this.c = handler;
        this.d = nzVar;
        this.e = z;
        if (Build.VERSION.SDK_INT < 26) {
            this.b = new e00(onAudioFocusChangeListener, handler);
            this.f = null;
            return;
        }
        this.b = onAudioFocusChangeListener;
        this.f = new AudioFocusRequest.Builder(i).setAudioAttributes(nzVar.b()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z2).build();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f00) {
                f00 f00Var = (f00) obj;
                if (this.a == f00Var.a && this.e == f00Var.e && Objects.equals(this.b, f00Var.b) && this.c.equals(f00Var.c) && Objects.equals(this.d, f00Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
