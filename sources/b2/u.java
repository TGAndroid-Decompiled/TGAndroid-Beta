package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class u extends c1 {
    public static final String d;
    public static final String e;
    public final boolean f3327b;
    public final boolean f3328c;

    static {
        String str = e2.d0.f7887a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public u() {
        this.f3327b = false;
        this.f3328c = false;
    }

    @Override
    public final boolean b() {
        return this.f3327b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2956a, 0);
        bundle.putBoolean(d, this.f3327b);
        bundle.putBoolean(e, this.f3328c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f3328c == uVar.f3328c && this.f3327b == uVar.f3327b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3327b), Boolean.valueOf(this.f3328c));
    }

    public u(boolean z10) {
        this.f3327b = true;
        this.f3328c = z10;
    }
}
