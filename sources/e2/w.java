package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class w extends d1 {
    public static final String d;
    public static final String f10779e;
    public final boolean f10780b;
    public final boolean f10781c;

    static {
        String str = h2.l0.f13778a;
        d = Integer.toString(1, 36);
        f10779e = Integer.toString(2, 36);
    }

    public w() {
        this.f10780b = false;
        this.f10781c = false;
    }

    @Override
    public final boolean b() {
        return this.f10780b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10360a, 0);
        bundle.putBoolean(d, this.f10780b);
        bundle.putBoolean(f10779e, this.f10781c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f10781c == wVar.f10781c && this.f10780b == wVar.f10780b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10780b), Boolean.valueOf(this.f10781c));
    }

    public w(boolean z10) {
        this.f10780b = true;
        this.f10781c = z10;
    }
}
