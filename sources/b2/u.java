package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class u extends c1 {
    public static final String d;
    public static final String f3659e;
    public final boolean f3660b;
    public final boolean f3661c;

    static {
        String str = e2.d0.f8529a;
        d = Integer.toString(1, 36);
        f3659e = Integer.toString(2, 36);
    }

    public u() {
        this.f3660b = false;
        this.f3661c = false;
    }

    @Override
    public final boolean b() {
        return this.f3660b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f3261a, 0);
        bundle.putBoolean(d, this.f3660b);
        bundle.putBoolean(f3659e, this.f3661c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f3661c == uVar.f3661c && this.f3660b == uVar.f3660b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3660b), Boolean.valueOf(this.f3661c));
    }

    public u(boolean z10) {
        this.f3660b = true;
        this.f3661c = z10;
    }
}
