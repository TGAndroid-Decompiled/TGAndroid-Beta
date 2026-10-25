package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class k1 extends h1 {
    public static final String d;
    public static final String e;
    public final boolean f3260b;
    public final boolean f3261c;

    static {
        String str = e2.n0.f9692a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public k1() {
        this.f3260b = false;
        this.f3261c = false;
    }

    @Override
    public final boolean b() {
        return this.f3260b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h1.f3226a, 3);
        bundle.putBoolean(d, this.f3260b);
        bundle.putBoolean(e, this.f3261c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            if (this.f3261c == k1Var.f3261c && this.f3260b == k1Var.f3260b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3260b), Boolean.valueOf(this.f3261c));
    }

    public k1(boolean z10) {
        this.f3260b = true;
        this.f3261c = z10;
    }
}
