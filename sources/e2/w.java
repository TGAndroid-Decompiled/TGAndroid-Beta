package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class w extends d1 {
    public static final String d;
    public static final String f10777e;
    public final boolean f10778b;
    public final boolean f10779c;

    static {
        String str = h2.l0.f13778a;
        d = Integer.toString(1, 36);
        f10777e = Integer.toString(2, 36);
    }

    public w() {
        this.f10778b = false;
        this.f10779c = false;
    }

    @Override
    public final boolean b() {
        return this.f10778b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10358a, 0);
        bundle.putBoolean(d, this.f10778b);
        bundle.putBoolean(f10777e, this.f10779c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f10779c == wVar.f10779c && this.f10778b == wVar.f10778b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10778b), Boolean.valueOf(this.f10779c));
    }

    public w(boolean z10) {
        this.f10778b = true;
        this.f10779c = z10;
    }
}
