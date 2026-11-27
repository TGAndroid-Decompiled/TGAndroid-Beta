package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
public final class rr7 implements OnBackAnimationCallback {
    public final ur4 a;
    public final ur4 b;
    public final sr4 c;
    public final sr4 d;

    public rr7(ur4 ur4Var, ur4 ur4Var2, sr4 sr4Var, sr4 sr4Var2) {
        this.a = ur4Var;
        this.b = ur4Var2;
        this.c = sr4Var;
        this.d = sr4Var2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.invoke(new hd0(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.invoke(new hd0(backEvent));
    }
}
