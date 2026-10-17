package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class j1 extends g1 {
    public static final String d;
    public static final String e;
    public final boolean f3805b;
    public final boolean f3806c;

    static {
        String str = e2.m0.f8254a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public j1() {
        this.f3805b = false;
        this.f3806c = false;
    }

    @Override
    public final boolean b() {
        return this.f3805b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f3771a, 3);
        bundle.putBoolean(d, this.f3805b);
        bundle.putBoolean(e, this.f3806c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            if (this.f3806c == j1Var.f3806c && this.f3805b == j1Var.f3805b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3805b), Boolean.valueOf(this.f3806c));
    }

    public j1(boolean z10) {
        this.f3805b = true;
        this.f3806c = z10;
    }
}
