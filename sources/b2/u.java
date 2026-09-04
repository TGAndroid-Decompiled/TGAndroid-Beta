package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class u extends c1 {
    public static final String d;
    public static final String f2388e;
    public final boolean f2389b;
    public final boolean f2390c;

    static {
        String str = e2.d0.f8737a;
        d = Integer.toString(1, 36);
        f2388e = Integer.toString(2, 36);
    }

    public u() {
        this.f2389b = false;
        this.f2390c = false;
    }

    @Override
    public final boolean b() {
        return this.f2389b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f1990a, 0);
        bundle.putBoolean(d, this.f2389b);
        bundle.putBoolean(f2388e, this.f2390c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f2390c == uVar.f2390c && this.f2389b == uVar.f2389b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2389b), Boolean.valueOf(this.f2390c));
    }

    public u(boolean z10) {
        this.f2389b = true;
        this.f2390c = z10;
    }
}
