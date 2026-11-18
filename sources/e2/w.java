package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class w extends d1 {
    public static final String d;
    public static final String f10784e;
    public final boolean f10785b;
    public final boolean f10786c;

    static {
        String str = h2.l0.f13783a;
        d = Integer.toString(1, 36);
        f10784e = Integer.toString(2, 36);
    }

    public w() {
        this.f10785b = false;
        this.f10786c = false;
    }

    @Override
    public final boolean b() {
        return this.f10785b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10365a, 0);
        bundle.putBoolean(d, this.f10785b);
        bundle.putBoolean(f10784e, this.f10786c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f10786c == wVar.f10786c && this.f10785b == wVar.f10785b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10785b), Boolean.valueOf(this.f10786c));
    }

    public w(boolean z10) {
        this.f10785b = true;
        this.f10786c = z10;
    }
}
