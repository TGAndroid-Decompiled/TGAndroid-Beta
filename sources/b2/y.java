package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class y extends g1 {
    public static final String d;
    public static final String e;
    public final boolean f4142b;
    public final boolean f4143c;

    static {
        String str = e2.m0.f8252a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public y() {
        this.f4142b = false;
        this.f4143c = false;
    }

    @Override
    public final boolean b() {
        return this.f4142b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f3768a, 0);
        bundle.putBoolean(d, this.f4142b);
        bundle.putBoolean(e, this.f4143c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f4143c == yVar.f4143c && this.f4142b == yVar.f4142b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f4142b), Boolean.valueOf(this.f4143c));
    }

    public y(boolean z10) {
        this.f4142b = true;
        this.f4143c = z10;
    }
}
