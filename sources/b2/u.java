package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class u extends c1 {
    public static final String d;
    public static final String e;
    public final boolean f3319b;
    public final boolean f3320c;

    static {
        String str = e2.d0.f7871a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public u() {
        this.f3319b = false;
        this.f3320c = false;
    }

    @Override
    public final boolean b() {
        return this.f3319b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2948a, 0);
        bundle.putBoolean(d, this.f3319b);
        bundle.putBoolean(e, this.f3320c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f3320c == uVar.f3320c && this.f3319b == uVar.f3319b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3319b), Boolean.valueOf(this.f3320c));
    }

    public u(boolean z10) {
        this.f3319b = true;
        this.f3320c = z10;
    }
}
