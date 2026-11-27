package defpackage;

import android.os.SystemClock;
public final class n55 {
    public final sk7 a;
    public final l55 b;
    public final long c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f;
    public Runnable g;
    public hl3 h;

    public n55(sk7 sk7Var, l55 l55Var) {
        this.a = sk7Var;
        this.b = l55Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.c < 700) {
            return true;
        }
        return false;
    }
}
