package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class z extends h1 {
    public static final String d;
    public static final String e;
    public final boolean f3600b;
    public final boolean f3601c;

    static {
        String str = e2.n0.f9692a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public z() {
        this.f3600b = false;
        this.f3601c = false;
    }

    @Override
    public final boolean b() {
        return this.f3600b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h1.f3226a, 0);
        bundle.putBoolean(d, this.f3600b);
        bundle.putBoolean(e, this.f3601c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f3601c == zVar.f3601c && this.f3600b == zVar.f3600b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3600b), Boolean.valueOf(this.f3601c));
    }

    public z(boolean z10) {
        this.f3600b = true;
        this.f3601c = z10;
    }
}
