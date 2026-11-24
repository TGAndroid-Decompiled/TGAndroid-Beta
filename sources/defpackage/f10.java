package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class f10 {
    public final byte a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final o00 d;
    public final boolean e;
    public final Object f;

    public f10(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, o00 o00Var, boolean z, boolean z2) {
        this.a = i;
        this.c = handler;
        this.d = o00Var;
        this.e = z;
        if (Build.VERSION.SDK_INT < 26) {
            this.b = new e10(onAudioFocusChangeListener, handler);
            this.f = null;
            return;
        }
        this.b = onAudioFocusChangeListener;
        this.f = new AudioFocusRequest.Builder(i).setAudioAttributes(o00Var.b()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z2).build();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f10) {
                f10 f10Var = (f10) obj;
                if (this.a == f10Var.a && this.e == f10Var.e && Objects.equals(this.b, f10Var.b) && this.c.equals(f10Var.c) && Objects.equals(this.d, f10Var.d)) {
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
