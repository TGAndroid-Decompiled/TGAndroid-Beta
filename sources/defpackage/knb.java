package defpackage;

import android.os.Bundle;
import j$.util.Objects;
public final class knb extends fz8 {
    public static final String d;
    public static final String e;
    public final boolean b;
    public final boolean c;

    static {
        String str = g8c.a;
        d = "1";
        e = "2";
    }

    public knb() {
        this.b = false;
        this.c = false;
    }

    @Override
    public final boolean b() {
        return this.b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(fz8.a, 3);
        bundle.putBoolean(d, this.b);
        bundle.putBoolean(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof knb) {
            knb knbVar = (knb) obj;
            if (this.c == knbVar.c && this.b == knbVar.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }

    public knb(boolean z) {
        this.b = true;
        this.c = z;
    }
}
