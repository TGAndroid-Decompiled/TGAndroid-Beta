package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class k1 extends h1 {
    public static final String d;
    public static final String e;
    public final boolean f2193b;
    public final boolean f2194c;

    static {
        String str = e2.m0.f8372a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public k1() {
        this.f2193b = false;
        this.f2194c = false;
    }

    @Override
    public final boolean b() {
        return this.f2193b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h1.f2159a, 3);
        bundle.putBoolean(d, this.f2193b);
        bundle.putBoolean(e, this.f2194c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            if (this.f2194c == k1Var.f2194c && this.f2193b == k1Var.f2193b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2193b), Boolean.valueOf(this.f2194c));
    }

    public k1(boolean z10) {
        this.f2193b = true;
        this.f2194c = z10;
    }
}
