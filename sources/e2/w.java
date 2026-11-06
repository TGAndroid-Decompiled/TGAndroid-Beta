package e2;

import android.os.Bundle;
import j$.util.Objects;
public final class w extends d1 {
    public static final String d;
    public static final String f10633e;
    public final boolean f10634b;
    public final boolean f10635c;

    static {
        String str = h2.m0.f14112a;
        d = Integer.toString(1, 36);
        f10633e = Integer.toString(2, 36);
    }

    public w() {
        this.f10634b = false;
        this.f10635c = false;
    }

    @Override
    public final boolean b() {
        return this.f10634b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f10214a, 0);
        bundle.putBoolean(d, this.f10634b);
        bundle.putBoolean(f10633e, this.f10635c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f10635c == wVar.f10635c && this.f10634b == wVar.f10634b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f10634b), Boolean.valueOf(this.f10635c));
    }

    public w(boolean z9) {
        this.f10634b = true;
        this.f10635c = z9;
    }
}
