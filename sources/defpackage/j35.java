package defpackage;

import android.os.SystemClock;
public final class j35 {
    public final ki7 a;
    public final h35 b;
    public final long c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f;
    public Runnable g;
    public sm3 h;

    public j35(ki7 ki7Var, h35 h35Var) {
        this.a = ki7Var;
        this.b = h35Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.c < 700) {
            return true;
        }
        return false;
    }
}
