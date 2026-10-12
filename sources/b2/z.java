package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class z extends h1 {
    public static final String d;
    public static final String e;
    public final boolean f2533b;
    public final boolean f2534c;

    static {
        String str = e2.m0.f8372a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public z() {
        this.f2533b = false;
        this.f2534c = false;
    }

    @Override
    public final boolean b() {
        return this.f2533b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h1.f2159a, 0);
        bundle.putBoolean(d, this.f2533b);
        bundle.putBoolean(e, this.f2534c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f2534c == zVar.f2534c && this.f2533b == zVar.f2533b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2533b), Boolean.valueOf(this.f2534c));
    }

    public z(boolean z10) {
        this.f2533b = true;
        this.f2534c = z10;
    }
}
