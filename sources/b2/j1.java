package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class j1 extends g1 {
    public static final String d;
    public static final String e;
    public final boolean f3804b;
    public final boolean f3805c;

    static {
        String str = e2.m0.f8254a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public j1() {
        this.f3804b = false;
        this.f3805c = false;
    }

    @Override
    public final boolean b() {
        return this.f3804b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f3770a, 3);
        bundle.putBoolean(d, this.f3804b);
        bundle.putBoolean(e, this.f3805c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            if (this.f3805c == j1Var.f3805c && this.f3804b == j1Var.f3804b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3804b), Boolean.valueOf(this.f3805c));
    }

    public j1(boolean z10) {
        this.f3804b = true;
        this.f3805c = z10;
    }
}
