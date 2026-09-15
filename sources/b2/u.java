package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class u extends c1 {
    public static final String d;
    public static final String e;
    public final boolean f3322b;
    public final boolean f3323c;

    static {
        String str = e2.d0.f7883a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public u() {
        this.f3322b = false;
        this.f3323c = false;
    }

    @Override
    public final boolean b() {
        return this.f3322b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2951a, 0);
        bundle.putBoolean(d, this.f3322b);
        bundle.putBoolean(e, this.f3323c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f3323c == uVar.f3323c && this.f3322b == uVar.f3322b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3322b), Boolean.valueOf(this.f3323c));
    }

    public u(boolean z10) {
        this.f3322b = true;
        this.f3323c = z10;
    }
}
