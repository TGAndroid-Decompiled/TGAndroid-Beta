package defpackage;

import java.util.Arrays;
public final class o8d implements wn {
    public static final o8d c;
    public final boolean a;
    public final String b;

    static {
        zhc zhcVar = new zhc((byte) 7, false);
        zhcVar.b = Boolean.FALSE;
        c = new o8d(zhcVar);
    }

    public o8d(zhc zhcVar) {
        this.a = ((Boolean) zhcVar.b).booleanValue();
        this.b = (String) zhcVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o8d)) {
            return false;
        }
        o8d o8dVar = (o8d) obj;
        if (vue.a(null, null) && this.a == o8dVar.a && vue.a(this.b, o8dVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
