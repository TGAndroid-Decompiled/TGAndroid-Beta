package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class u extends c1 {
    public static final String d;
    public static final String e;
    public final boolean f3321b;
    public final boolean f3322c;

    static {
        String str = e2.d0.f7872a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public u() {
        this.f3321b = false;
        this.f3322c = false;
    }

    @Override
    public final boolean b() {
        return this.f3321b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2950a, 0);
        bundle.putBoolean(d, this.f3321b);
        bundle.putBoolean(e, this.f3322c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f3322c == uVar.f3322c && this.f3321b == uVar.f3321b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3321b), Boolean.valueOf(this.f3322c));
    }

    public u(boolean z10) {
        this.f3321b = true;
        this.f3322c = z10;
    }
}
