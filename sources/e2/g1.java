package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class g1 extends d1 {
    public static final String d;
    public static final String f10416e;
    public final boolean f10417b;
    public final boolean f10418c;

    static {
        String str = h2.l0.f13783a;
        d = Integer.toString(1, 36);
        f10416e = Integer.toString(2, 36);
    }

    public g1() {
        this.f10417b = false;
        this.f10418c = false;
    }

    @Override
    public final boolean b() {
        return this.f10417b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10365a, 3);
        bundle.putBoolean(d, this.f10417b);
        bundle.putBoolean(f10416e, this.f10418c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            if (this.f10418c == g1Var.f10418c && this.f10417b == g1Var.f10417b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10417b), Boolean.valueOf(this.f10418c));
    }

    public g1(boolean z10) {
        this.f10417b = true;
        this.f10418c = z10;
    }
}
