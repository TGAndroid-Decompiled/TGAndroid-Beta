package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;
public final class g00 {
    public final byte a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final oz d;
    public final boolean e;
    public final Object f;

    public g00(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, oz ozVar, boolean z, boolean z2) {
        this.a = i;
        this.c = handler;
        this.d = ozVar;
        this.e = z;
        if (Build.VERSION.SDK_INT < 26) {
            this.b = new f00(onAudioFocusChangeListener, handler);
            this.f = null;
            return;
        }
        this.b = onAudioFocusChangeListener;
        this.f = new AudioFocusRequest.Builder(i).setAudioAttributes(ozVar.b()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z2).build();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g00) {
                g00 g00Var = (g00) obj;
                if (this.a == g00Var.a && this.e == g00Var.e && Objects.equals(this.b, g00Var.b) && this.c.equals(g00Var.c) && Objects.equals(this.d, g00Var.d)) {
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
