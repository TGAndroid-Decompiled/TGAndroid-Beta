package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class y extends g1 {
    public static final String d;
    public static final String e;
    public final boolean f4144b;
    public final boolean f4145c;

    static {
        String str = e2.m0.f8254a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public y() {
        this.f4144b = false;
        this.f4145c = false;
    }

    @Override
    public final boolean b() {
        return this.f4144b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f3770a, 0);
        bundle.putBoolean(d, this.f4144b);
        bundle.putBoolean(e, this.f4145c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f4145c == yVar.f4145c && this.f4144b == yVar.f4144b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f4144b), Boolean.valueOf(this.f4145c));
    }

    public y(boolean z10) {
        this.f4144b = true;
        this.f4145c = z10;
    }
}
