package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class f1 extends c1 {
    public static final String d;
    public static final String e;
    public final boolean f1691b;
    public final boolean f1692c;

    static {
        String str = e2.d0.f7188a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public f1() {
        this.f1691b = false;
        this.f1692c = false;
    }

    @Override
    public final boolean b() {
        return this.f1691b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f1649a, 3);
        bundle.putBoolean(d, this.f1691b);
        bundle.putBoolean(e, this.f1692c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.f1692c == f1Var.f1692c && this.f1691b == f1Var.f1691b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1691b), Boolean.valueOf(this.f1692c));
    }

    public f1(boolean z10) {
        this.f1691b = true;
        this.f1692c = z10;
    }
}
