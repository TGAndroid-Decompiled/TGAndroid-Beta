package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class y extends g1 {
    public static final String d;
    public static final String e;
    public final boolean f4146b;
    public final boolean f4147c;

    static {
        String str = e2.m0.f8255a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public y() {
        this.f4146b = false;
        this.f4147c = false;
    }

    @Override
    public final boolean b() {
        return this.f4146b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f3772a, 0);
        bundle.putBoolean(d, this.f4146b);
        bundle.putBoolean(e, this.f4147c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f4147c == yVar.f4147c && this.f4146b == yVar.f4146b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f4146b), Boolean.valueOf(this.f4147c));
    }

    public y(boolean z10) {
        this.f4146b = true;
        this.f4147c = z10;
    }
}
