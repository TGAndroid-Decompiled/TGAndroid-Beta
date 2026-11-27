package defpackage;

import android.os.SystemClock;
import org.telegram.ui.ActionBar.e;
public final class na4 {
    public final y94 a;
    public ha4 b;
    public long c;
    public boolean d;
    public boolean e;
    public boolean f;
    public e g;

    public na4(su3 su3Var, y94 y94Var) {
        this.a = y94Var;
    }

    public final void a(ha4 ha4Var, boolean z, boolean z2) {
        boolean z3;
        b();
        this.b = ha4Var;
        this.c = SystemClock.uptimeMillis();
        this.d = z;
        if (z && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.e = z3;
        this.g = null;
        this.f = true;
    }

    public final void b() {
        Integer num;
        ha4 ha4Var = this.b;
        if (ha4Var != null) {
            this.b = null;
            if (this.e) {
                num = Integer.valueOf((int) (SystemClock.uptimeMillis() - this.c));
            } else {
                num = null;
            }
            String str = this.a.b;
            if (ha4Var == ea4.h) {
                ea4.h = null;
            }
            ha4Var.i = num;
            if (str != null) {
                ea4.e.postRunnable(new x94(str, ha4Var, (byte) 0));
            }
        }
    }

    public final void c(boolean z, boolean z2, boolean z3, e eVar) {
        boolean z4;
        boolean z5 = false;
        if (this.b != null && SystemClock.uptimeMillis() - this.c >= 3600000) {
            z4 = true;
        } else {
            z4 = false;
        }
        ha4 ha4Var = this.b;
        if (ha4Var != null && (!z || z4)) {
            this.e = true;
        }
        if (ha4Var != null && !z && this.g == null) {
            this.g = eVar;
        }
        e eVar2 = this.g;
        if (eVar2 != null && eVar != eVar2) {
            z5 = true;
        }
        if (ha4Var != null && this.e && (z4 || (!this.d ? !((!z2 || this.f) && !z5) : !z3))) {
            b();
        }
        this.f = z2;
    }

    public final void d(long j) {
        if (this.b != null) {
            if ((!this.d || !this.e) && j >= this.c + 1000) {
                b();
            }
        }
    }
}
