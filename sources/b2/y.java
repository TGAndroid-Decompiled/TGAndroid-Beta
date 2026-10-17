package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class y extends g1 {
    public static final String d;
    public static final String e;
    public final boolean f4145b;
    public final boolean f4146c;

    static {
        String str = e2.m0.f8254a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public y() {
        this.f4145b = false;
        this.f4146c = false;
    }

    @Override
    public final boolean b() {
        return this.f4145b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f3771a, 0);
        bundle.putBoolean(d, this.f4145b);
        bundle.putBoolean(e, this.f4146c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f4146c == yVar.f4146c && this.f4145b == yVar.f4145b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f4145b), Boolean.valueOf(this.f4146c));
    }

    public y(boolean z10) {
        this.f4145b = true;
        this.f4146c = z10;
    }
}
