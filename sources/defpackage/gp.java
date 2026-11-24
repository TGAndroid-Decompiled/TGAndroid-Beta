package defpackage;

import java.util.Arrays;
public final class gp {
    public final int a;
    public final zo b;
    public final wo c;
    public final String d;

    public gp(zo zoVar, wo woVar, String str) {
        this.b = zoVar;
        this.c = woVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{zoVar, woVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gp)) {
            return false;
        }
        gp gpVar = (gp) obj;
        if (!fse.a(this.b, gpVar.b) || !fse.a(this.c, gpVar.c) || !fse.a(this.d, gpVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
