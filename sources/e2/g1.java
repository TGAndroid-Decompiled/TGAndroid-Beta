package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class g1 extends d1 {
    public static final String d;
    public static final String f10411e;
    public final boolean f10412b;
    public final boolean f10413c;

    static {
        String str = h2.l0.f13778a;
        d = Integer.toString(1, 36);
        f10411e = Integer.toString(2, 36);
    }

    public g1() {
        this.f10412b = false;
        this.f10413c = false;
    }

    @Override
    public final boolean b() {
        return this.f10412b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10360a, 3);
        bundle.putBoolean(d, this.f10412b);
        bundle.putBoolean(f10411e, this.f10413c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            if (this.f10413c == g1Var.f10413c && this.f10412b == g1Var.f10412b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10412b), Boolean.valueOf(this.f10413c));
    }

    public g1(boolean z10) {
        this.f10412b = true;
        this.f10413c = z10;
    }
}
