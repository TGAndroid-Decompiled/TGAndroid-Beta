package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class f1 extends c1 {
    public static final String d;
    public static final String f2065e;
    public final boolean f2066b;
    public final boolean f2067c;

    static {
        String str = e2.d0.f8765a;
        d = Integer.toString(1, 36);
        f2065e = Integer.toString(2, 36);
    }

    public f1() {
        this.f2066b = false;
        this.f2067c = false;
    }

    @Override
    public final boolean b() {
        return this.f2066b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2017a, 3);
        bundle.putBoolean(d, this.f2066b);
        bundle.putBoolean(f2065e, this.f2067c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.f2067c == f1Var.f2067c && this.f2066b == f1Var.f2066b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2066b), Boolean.valueOf(this.f2067c));
    }

    public f1(boolean z10) {
        this.f2066b = true;
        this.f2067c = z10;
    }
}
