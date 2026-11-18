package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class w extends d1 {
    public static final String d;
    public static final String f10787e;
    public final boolean f10788b;
    public final boolean f10789c;

    static {
        String str = h2.l0.f13786a;
        d = Integer.toString(1, 36);
        f10787e = Integer.toString(2, 36);
    }

    public w() {
        this.f10788b = false;
        this.f10789c = false;
    }

    @Override
    public final boolean b() {
        return this.f10788b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10368a, 0);
        bundle.putBoolean(d, this.f10788b);
        bundle.putBoolean(f10787e, this.f10789c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f10789c == wVar.f10789c && this.f10788b == wVar.f10788b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10788b), Boolean.valueOf(this.f10789c));
    }

    public w(boolean z10) {
        this.f10788b = true;
        this.f10789c = z10;
    }
}
