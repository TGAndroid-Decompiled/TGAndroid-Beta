package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class u extends c1 {
    public static final String d;
    public static final String e;
    public final boolean f3324b;
    public final boolean f3325c;

    static {
        String str = e2.d0.f7885a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public u() {
        this.f3324b = false;
        this.f3325c = false;
    }

    @Override
    public final boolean b() {
        return this.f3324b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2953a, 0);
        bundle.putBoolean(d, this.f3324b);
        bundle.putBoolean(e, this.f3325c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f3325c == uVar.f3325c && this.f3324b == uVar.f3324b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3324b), Boolean.valueOf(this.f3325c));
    }

    public u(boolean z10) {
        this.f3324b = true;
        this.f3325c = z10;
    }
}
