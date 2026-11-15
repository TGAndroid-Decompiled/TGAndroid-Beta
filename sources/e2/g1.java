package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class g1 extends d1 {
    public static final String d;
    public static final String f10101e;
    public final boolean f10102b;
    public final boolean f10103c;

    static {
        String str = h2.l0.f13471a;
        d = Integer.toString(1, 36);
        f10101e = Integer.toString(2, 36);
    }

    public g1() {
        this.f10102b = false;
        this.f10103c = false;
    }

    @Override
    public final boolean b() {
        return this.f10102b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10050a, 3);
        bundle.putBoolean(d, this.f10102b);
        bundle.putBoolean(f10101e, this.f10103c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            if (this.f10103c == g1Var.f10103c && this.f10102b == g1Var.f10102b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10102b), Boolean.valueOf(this.f10103c));
    }

    public g1(boolean z10) {
        this.f10102b = true;
        this.f10103c = z10;
    }
}
