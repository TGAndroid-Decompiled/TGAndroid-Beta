package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class z extends h1 {
    public static final String d;
    public static final String e;
    public final boolean f2537b;
    public final boolean f2538c;

    static {
        String str = e2.m0.f8375a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public z() {
        this.f2537b = false;
        this.f2538c = false;
    }

    @Override
    public final boolean b() {
        return this.f2537b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h1.f2163a, 0);
        bundle.putBoolean(d, this.f2537b);
        bundle.putBoolean(e, this.f2538c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f2538c == zVar.f2538c && this.f2537b == zVar.f2537b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2537b), Boolean.valueOf(this.f2538c));
    }

    public z(boolean z10) {
        this.f2537b = true;
        this.f2538c = z10;
    }
}
