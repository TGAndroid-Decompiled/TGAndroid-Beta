package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class f1 extends c1 {
    public static final String d;
    public static final String f3232e;
    public final boolean f3233b;
    public final boolean f3234c;

    static {
        String str = e2.d0.f8538a;
        d = Integer.toString(1, 36);
        f3232e = Integer.toString(2, 36);
    }

    public f1() {
        this.f3233b = false;
        this.f3234c = false;
    }

    @Override
    public final boolean b() {
        return this.f3233b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f3184a, 3);
        bundle.putBoolean(d, this.f3233b);
        bundle.putBoolean(f3232e, this.f3234c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.f3234c == f1Var.f3234c && this.f3233b == f1Var.f3233b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3233b), Boolean.valueOf(this.f3234c));
    }

    public f1(boolean z10) {
        this.f3233b = true;
        this.f3234c = z10;
    }
}
