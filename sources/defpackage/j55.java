package defpackage;

import android.os.SystemClock;
public final class j55 {
    public final mk7 a;
    public final h55 b;
    public final long c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f;
    public Runnable g;
    public bm3 h;

    public j55(mk7 mk7Var, h55 h55Var) {
        this.a = mk7Var;
        this.b = h55Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.c < 700) {
            return true;
        }
        return false;
    }
}
