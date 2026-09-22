package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class f1 extends c1 {
    public static final String d;
    public static final String e;
    public final boolean f2995b;
    public final boolean f2996c;

    static {
        String str = e2.d0.f7885a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public f1() {
        this.f2995b = false;
        this.f2996c = false;
    }

    @Override
    public final boolean b() {
        return this.f2995b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2953a, 3);
        bundle.putBoolean(d, this.f2995b);
        bundle.putBoolean(e, this.f2996c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.f2996c == f1Var.f2996c && this.f2995b == f1Var.f2995b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2995b), Boolean.valueOf(this.f2996c));
    }

    public f1(boolean z10) {
        this.f2995b = true;
        this.f2996c = z10;
    }
}
