package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class u extends c1 {
    public static final String d;
    public static final String e;
    public final boolean f3326b;
    public final boolean f3327c;

    static {
        String str = e2.d0.f7887a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public u() {
        this.f3326b = false;
        this.f3327c = false;
    }

    @Override
    public final boolean b() {
        return this.f3326b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2955a, 0);
        bundle.putBoolean(d, this.f3326b);
        bundle.putBoolean(e, this.f3327c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f3327c == uVar.f3327c && this.f3326b == uVar.f3326b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3326b), Boolean.valueOf(this.f3327c));
    }

    public u(boolean z10) {
        this.f3326b = true;
        this.f3327c = z10;
    }
}
