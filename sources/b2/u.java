package b2;

import android.os.Bundle;
import j$.util.Objects;
public final class u extends c1 {
    public static final String d;
    public static final String f2415e;
    public final boolean f2416b;
    public final boolean f2417c;

    static {
        String str = e2.d0.f8765a;
        d = Integer.toString(1, 36);
        f2415e = Integer.toString(2, 36);
    }

    public u() {
        this.f2416b = false;
        this.f2417c = false;
    }

    @Override
    public final boolean b() {
        return this.f2416b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(c1.f2017a, 0);
        bundle.putBoolean(d, this.f2416b);
        bundle.putBoolean(f2415e, this.f2417c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f2417c == uVar.f2417c && this.f2416b == uVar.f2416b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f2416b), Boolean.valueOf(this.f2417c));
    }

    public u(boolean z10) {
        this.f2416b = true;
        this.f2417c = z10;
    }
}
