package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class w extends d1 {
    public static final String d;
    public static final String f10469e;
    public final boolean f10470b;
    public final boolean f10471c;

    static {
        String str = h2.l0.f13471a;
        d = Integer.toString(1, 36);
        f10469e = Integer.toString(2, 36);
    }

    public w() {
        this.f10470b = false;
        this.f10471c = false;
    }

    @Override
    public final boolean b() {
        return this.f10470b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10050a, 0);
        bundle.putBoolean(d, this.f10470b);
        bundle.putBoolean(f10469e, this.f10471c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f10471c == wVar.f10471c && this.f10470b == wVar.f10470b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10470b), Boolean.valueOf(this.f10471c));
    }

    public w(boolean z10) {
        this.f10470b = true;
        this.f10471c = z10;
    }
}
