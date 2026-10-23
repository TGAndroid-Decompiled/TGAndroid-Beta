package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class j1 extends g1 {
    public static final String d;
    public static final String e;
    public final boolean f3809b;
    public final boolean f3810c;

    static {
        String str = e2.m0.f8259a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public j1() {
        this.f3809b = false;
        this.f3810c = false;
    }

    @Override
    public final boolean b() {
        return this.f3809b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f3775a, 3);
        bundle.putBoolean(d, this.f3809b);
        bundle.putBoolean(e, this.f3810c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            if (this.f3810c == j1Var.f3810c && this.f3809b == j1Var.f3809b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3809b), Boolean.valueOf(this.f3810c));
    }

    public j1(boolean z10) {
        this.f3809b = true;
        this.f3810c = z10;
    }
}
