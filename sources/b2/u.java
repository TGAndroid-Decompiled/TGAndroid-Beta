package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class u extends c1 {
    public static final String d;
    public static final String e;
    public final boolean f2020b;
    public final boolean f2021c;

    static {
        String str = e2.d0.f7188a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public u() {
        this.f2020b = false;
        this.f2021c = false;
    }

    @Override
    public final boolean b() {
        return this.f2020b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f1649a, 0);
        bundle.putBoolean(d, this.f2020b);
        bundle.putBoolean(e, this.f2021c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f2021c == uVar.f2021c && this.f2020b == uVar.f2020b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2020b), Boolean.valueOf(this.f2021c));
    }

    public u(boolean z10) {
        this.f2020b = true;
        this.f2021c = z10;
    }
}
