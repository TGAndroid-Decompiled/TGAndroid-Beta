package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class u extends c1 {
    public static final String d;
    public static final String f3661e;
    public final boolean f3662b;
    public final boolean f3663c;

    static {
        String str = e2.d0.f8531a;
        d = Integer.toString(1, 36);
        f3661e = Integer.toString(2, 36);
    }

    public u() {
        this.f3662b = false;
        this.f3663c = false;
    }

    @Override
    public final boolean b() {
        return this.f3662b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f3263a, 0);
        bundle.putBoolean(d, this.f3662b);
        bundle.putBoolean(f3661e, this.f3663c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f3663c == uVar.f3663c && this.f3662b == uVar.f3662b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3662b), Boolean.valueOf(this.f3663c));
    }

    public u(boolean z10) {
        this.f3662b = true;
        this.f3663c = z10;
    }
}
