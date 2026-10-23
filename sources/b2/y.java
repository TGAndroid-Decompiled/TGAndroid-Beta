package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class y extends g1 {
    public static final String d;
    public static final String e;
    public final boolean f4149b;
    public final boolean f4150c;

    static {
        String str = e2.m0.f8259a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public y() {
        this.f4149b = false;
        this.f4150c = false;
    }

    @Override
    public final boolean b() {
        return this.f4149b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f3775a, 0);
        bundle.putBoolean(d, this.f4149b);
        bundle.putBoolean(e, this.f4150c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f4150c == yVar.f4150c && this.f4149b == yVar.f4149b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f4149b), Boolean.valueOf(this.f4150c));
    }

    public y(boolean z10) {
        this.f4149b = true;
        this.f4150c = z10;
    }
}
