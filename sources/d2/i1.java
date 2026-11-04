package d2;

import android.os.Bundle;
import j$.util.Objects;
public final class i1 extends f1 {
    public static final String d;
    public static final String f8145e;
    public final boolean f8146b;
    public final boolean f8147c;

    static {
        String str = g2.n0.f11873a;
        d = Integer.toString(1, 36);
        f8145e = Integer.toString(2, 36);
    }

    public i1() {
        this.f8146b = false;
        this.f8147c = false;
    }

    @Override
    public final boolean b() {
        return this.f8146b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(f1.f8107a, 3);
        bundle.putBoolean(d, this.f8146b);
        bundle.putBoolean(f8145e, this.f8147c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            if (this.f8147c == i1Var.f8147c && this.f8146b == i1Var.f8146b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f8146b), Boolean.valueOf(this.f8147c));
    }

    public i1(boolean z10) {
        this.f8146b = true;
        this.f8147c = z10;
    }
}
