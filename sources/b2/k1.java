package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class k1 extends h1 {
    public static final String d;
    public static final String e;
    public final boolean f2197b;
    public final boolean f2198c;

    static {
        String str = e2.m0.f8375a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public k1() {
        this.f2197b = false;
        this.f2198c = false;
    }

    @Override
    public final boolean b() {
        return this.f2197b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h1.f2163a, 3);
        bundle.putBoolean(d, this.f2197b);
        bundle.putBoolean(e, this.f2198c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            if (this.f2198c == k1Var.f2198c && this.f2197b == k1Var.f2197b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2197b), Boolean.valueOf(this.f2198c));
    }

    public k1(boolean z10) {
        this.f2197b = true;
        this.f2198c = z10;
    }
}
