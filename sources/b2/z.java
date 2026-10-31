package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class z extends g1 {
    public static final String d;
    public static final String e;
    public final boolean f2440b;
    public final boolean f2441c;

    static {
        String str = e2.l0.f6165a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public z() {
        this.f2440b = false;
        this.f2441c = false;
    }

    @Override
    public final boolean b() {
        return this.f2440b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f2046a, 0);
        bundle.putBoolean(d, this.f2440b);
        bundle.putBoolean(e, this.f2441c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f2441c == zVar.f2441c && this.f2440b == zVar.f2440b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2440b), Boolean.valueOf(this.f2441c));
    }

    public z(boolean z10) {
        this.f2440b = true;
        this.f2441c = z10;
    }
}
