package defpackage;

import android.os.SystemClock;
import org.telegram.ui.ActionBar.d;
public final class ra4 {
    public final ca4 a;
    public la4 b;
    public long c;
    public boolean d;
    public boolean e;
    public boolean f;
    public d g;

    public ra4(h64 h64Var, ca4 ca4Var) {
        this.a = ca4Var;
    }

    public final void a() {
        Integer num;
        la4 la4Var = this.b;
        if (la4Var != null) {
            this.b = null;
            if (this.e) {
                num = Integer.valueOf((int) (SystemClock.uptimeMillis() - this.c));
            } else {
                num = null;
            }
            String str = this.a.b;
            if (la4Var == ia4.g) {
                ia4.g = null;
            }
            la4Var.i = num;
            if (str != null) {
                ia4.d.postRunnable(new ba4(str, la4Var, (byte) 0));
            }
        }
    }
}
