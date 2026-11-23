package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class g1 extends d1 {
    public static final String d;
    public static final String f10448e;
    public final boolean f10449b;
    public final boolean f10450c;

    static {
        String str = h2.l0.f13815a;
        d = Integer.toString(1, 36);
        f10448e = Integer.toString(2, 36);
    }

    public g1() {
        this.f10449b = false;
        this.f10450c = false;
    }

    @Override
    public final boolean b() {
        return this.f10449b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10397a, 3);
        bundle.putBoolean(d, this.f10449b);
        bundle.putBoolean(f10448e, this.f10450c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            if (this.f10450c == g1Var.f10450c && this.f10449b == g1Var.f10449b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10449b), Boolean.valueOf(this.f10450c));
    }

    public g1(boolean z10) {
        this.f10449b = true;
        this.f10450c = z10;
    }
}
