package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class j1 extends g1 {
    public static final String d;
    public static final String e;
    public final boolean f2080b;
    public final boolean f2081c;

    static {
        String str = e2.l0.f6165a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public j1() {
        this.f2080b = false;
        this.f2081c = false;
    }

    @Override
    public final boolean b() {
        return this.f2080b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f2046a, 3);
        bundle.putBoolean(d, this.f2080b);
        bundle.putBoolean(e, this.f2081c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            if (this.f2081c == j1Var.f2081c && this.f2080b == j1Var.f2080b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2080b), Boolean.valueOf(this.f2081c));
    }

    public j1(boolean z10) {
        this.f2080b = true;
        this.f2081c = z10;
    }
}
