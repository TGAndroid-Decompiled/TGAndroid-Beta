package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class u extends c1 {
    public static final String d;
    public static final String f3582e;
    public final boolean f3583b;
    public final boolean f3584c;

    static {
        String str = e2.d0.f8537a;
        d = Integer.toString(1, 36);
        f3582e = Integer.toString(2, 36);
    }

    public u() {
        this.f3583b = false;
        this.f3584c = false;
    }

    @Override
    public final boolean b() {
        return this.f3583b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f3184a, 0);
        bundle.putBoolean(d, this.f3583b);
        bundle.putBoolean(f3582e, this.f3584c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f3584c == uVar.f3584c && this.f3583b == uVar.f3583b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3583b), Boolean.valueOf(this.f3584c));
    }

    public u(boolean z10) {
        this.f3583b = true;
        this.f3584c = z10;
    }
}
