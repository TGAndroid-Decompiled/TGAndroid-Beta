package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class g1 extends d1 {
    public static final String d;
    public static final String f10409e;
    public final boolean f10410b;
    public final boolean f10411c;

    static {
        String str = h2.l0.f13778a;
        d = Integer.toString(1, 36);
        f10409e = Integer.toString(2, 36);
    }

    public g1() {
        this.f10410b = false;
        this.f10411c = false;
    }

    @Override
    public final boolean b() {
        return this.f10410b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10358a, 3);
        bundle.putBoolean(d, this.f10410b);
        bundle.putBoolean(f10409e, this.f10411c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            if (this.f10411c == g1Var.f10411c && this.f10410b == g1Var.f10410b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10410b), Boolean.valueOf(this.f10411c));
    }

    public g1(boolean z10) {
        this.f10410b = true;
        this.f10411c = z10;
    }
}
