package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class g1 extends d1 {
    public static final String d;
    public static final String f10270e;
    public final boolean f10271b;
    public final boolean f10272c;

    static {
        String str = h2.m0.f14114a;
        d = Integer.toString(1, 36);
        f10270e = Integer.toString(2, 36);
    }

    public g1() {
        this.f10271b = false;
        this.f10272c = false;
    }

    @Override
    public final boolean b() {
        return this.f10271b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10219a, 3);
        bundle.putBoolean(d, this.f10271b);
        bundle.putBoolean(f10270e, this.f10272c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            if (this.f10272c == g1Var.f10272c && this.f10271b == g1Var.f10271b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10271b), Boolean.valueOf(this.f10272c));
    }

    public g1(boolean z9) {
        this.f10271b = true;
        this.f10272c = z9;
    }
}
