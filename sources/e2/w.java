package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class w extends d1 {
    public static final String d;
    public static final String f10816e;
    public final boolean f10817b;
    public final boolean f10818c;

    static {
        String str = h2.l0.f13815a;
        d = Integer.toString(1, 36);
        f10816e = Integer.toString(2, 36);
    }

    public w() {
        this.f10817b = false;
        this.f10818c = false;
    }

    @Override
    public final boolean b() {
        return this.f10817b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10397a, 0);
        bundle.putBoolean(d, this.f10817b);
        bundle.putBoolean(f10816e, this.f10818c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f10818c == wVar.f10818c && this.f10817b == wVar.f10817b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10817b), Boolean.valueOf(this.f10818c));
    }

    public w(boolean z10) {
        this.f10817b = true;
        this.f10818c = z10;
    }
}
