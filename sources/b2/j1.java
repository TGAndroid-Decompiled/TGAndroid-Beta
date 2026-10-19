package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class j1 extends g1 {
    public static final String d;
    public static final String e;
    public final boolean f3802b;
    public final boolean f3803c;

    static {
        String str = e2.m0.f8252a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public j1() {
        this.f3802b = false;
        this.f3803c = false;
    }

    @Override
    public final boolean b() {
        return this.f3802b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f3768a, 3);
        bundle.putBoolean(d, this.f3802b);
        bundle.putBoolean(e, this.f3803c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            if (this.f3803c == j1Var.f3803c && this.f3802b == j1Var.f3802b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3802b), Boolean.valueOf(this.f3803c));
    }

    public j1(boolean z10) {
        this.f3802b = true;
        this.f3803c = z10;
    }
}
