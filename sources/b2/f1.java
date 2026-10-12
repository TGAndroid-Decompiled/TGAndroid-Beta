package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class f1 extends c1 {
    public static final String d;
    public static final String f3309e;
    public final boolean f3310b;
    public final boolean f3311c;

    static {
        String str = e2.d0.f8529a;
        d = Integer.toString(1, 36);
        f3309e = Integer.toString(2, 36);
    }

    public f1() {
        this.f3310b = false;
        this.f3311c = false;
    }

    @Override
    public final boolean b() {
        return this.f3310b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f3261a, 3);
        bundle.putBoolean(d, this.f3310b);
        bundle.putBoolean(f3309e, this.f3311c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            if (this.f3311c == f1Var.f3311c && this.f3310b == f1Var.f3310b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3310b), Boolean.valueOf(this.f3311c));
    }

    public f1(boolean z10) {
        this.f3310b = true;
        this.f3311c = z10;
    }
}
