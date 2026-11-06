package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class g1 extends d1 {
    public static final String d;
    public static final String f10265e;
    public final boolean f10266b;
    public final boolean f10267c;

    static {
        String str = h2.m0.f14112a;
        d = Integer.toString(1, 36);
        f10265e = Integer.toString(2, 36);
    }

    public g1() {
        this.f10266b = false;
        this.f10267c = false;
    }

    @Override
    public final boolean b() {
        return this.f10266b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10214a, 3);
        bundle.putBoolean(d, this.f10266b);
        bundle.putBoolean(f10265e, this.f10267c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            if (this.f10267c == g1Var.f10267c && this.f10266b == g1Var.f10266b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10266b), Boolean.valueOf(this.f10267c));
    }

    public g1(boolean z9) {
        this.f10266b = true;
        this.f10267c = z9;
    }
}
