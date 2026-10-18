package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class j1 extends g1 {
    public static final String d;
    public static final String e;
    public final boolean f3806b;
    public final boolean f3807c;

    static {
        String str = e2.m0.f8253a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public j1() {
        this.f3806b = false;
        this.f3807c = false;
    }

    @Override
    public final boolean b() {
        return this.f3806b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f3772a, 3);
        bundle.putBoolean(d, this.f3806b);
        bundle.putBoolean(e, this.f3807c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            if (this.f3807c == j1Var.f3807c && this.f3806b == j1Var.f3806b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3806b), Boolean.valueOf(this.f3807c));
    }

    public j1(boolean z10) {
        this.f3806b = true;
        this.f3807c = z10;
    }
}
