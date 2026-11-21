package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class g1 extends d1 {
    public static final String d;
    public static final String f10445e;
    public final boolean f10446b;
    public final boolean f10447c;

    static {
        String str = h2.l0.f13812a;
        d = Integer.toString(1, 36);
        f10445e = Integer.toString(2, 36);
    }

    public g1() {
        this.f10446b = false;
        this.f10447c = false;
    }

    @Override
    public final boolean b() {
        return this.f10446b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10394a, 3);
        bundle.putBoolean(d, this.f10446b);
        bundle.putBoolean(f10445e, this.f10447c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            if (this.f10447c == g1Var.f10447c && this.f10446b == g1Var.f10446b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10446b), Boolean.valueOf(this.f10447c));
    }

    public g1(boolean z10) {
        this.f10446b = true;
        this.f10447c = z10;
    }
}
