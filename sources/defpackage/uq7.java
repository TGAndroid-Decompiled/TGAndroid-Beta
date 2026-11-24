package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
public final class uq7 implements OnBackAnimationCallback {
    public final rr4 a;
    public final rr4 b;
    public final pr4 c;
    public final pr4 d;

    public uq7(rr4 rr4Var, rr4 rr4Var2, pr4 pr4Var, pr4 pr4Var2) {
        this.a = rr4Var;
        this.b = rr4Var2;
        this.c = pr4Var;
        this.d = pr4Var2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.invoke(new fe0(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.invoke(new fe0(backEvent));
    }
}
