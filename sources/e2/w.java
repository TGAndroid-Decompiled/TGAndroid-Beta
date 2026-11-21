package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class w extends d1 {
    public static final String d;
    public static final String f10813e;
    public final boolean f10814b;
    public final boolean f10815c;

    static {
        String str = h2.l0.f13812a;
        d = Integer.toString(1, 36);
        f10813e = Integer.toString(2, 36);
    }

    public w() {
        this.f10814b = false;
        this.f10815c = false;
    }

    @Override
    public final boolean b() {
        return this.f10814b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10394a, 0);
        bundle.putBoolean(d, this.f10814b);
        bundle.putBoolean(f10813e, this.f10815c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f10815c == wVar.f10815c && this.f10814b == wVar.f10814b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10814b), Boolean.valueOf(this.f10815c));
    }

    public w(boolean z10) {
        this.f10814b = true;
        this.f10815c = z10;
    }
}
