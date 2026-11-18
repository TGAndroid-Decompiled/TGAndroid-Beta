package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class g1 extends d1 {
    public static final String d;
    public static final String f10419e;
    public final boolean f10420b;
    public final boolean f10421c;

    static {
        String str = h2.l0.f13786a;
        d = Integer.toString(1, 36);
        f10419e = Integer.toString(2, 36);
    }

    public g1() {
        this.f10420b = false;
        this.f10421c = false;
    }

    @Override
    public final boolean b() {
        return this.f10420b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10368a, 3);
        bundle.putBoolean(d, this.f10420b);
        bundle.putBoolean(f10419e, this.f10421c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            if (this.f10421c == g1Var.f10421c && this.f10420b == g1Var.f10420b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10420b), Boolean.valueOf(this.f10421c));
    }

    public g1(boolean z10) {
        this.f10420b = true;
        this.f10421c = z10;
    }
}
