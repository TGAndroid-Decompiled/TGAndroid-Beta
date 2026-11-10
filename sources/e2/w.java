package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class w extends d1 {
    public static final String d;
    public static final String f10638e;
    public final boolean f10639b;
    public final boolean f10640c;

    static {
        String str = h2.m0.f14114a;
        d = Integer.toString(1, 36);
        f10638e = Integer.toString(2, 36);
    }

    public w() {
        this.f10639b = false;
        this.f10640c = false;
    }

    @Override
    public final boolean b() {
        return this.f10639b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10219a, 0);
        bundle.putBoolean(d, this.f10639b);
        bundle.putBoolean(f10638e, this.f10640c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f10640c == wVar.f10640c && this.f10639b == wVar.f10639b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10639b), Boolean.valueOf(this.f10640c));
    }

    public w(boolean z9) {
        this.f10639b = true;
        this.f10640c = z9;
    }
}
