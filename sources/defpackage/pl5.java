package defpackage;

import java.util.Arrays;
public final class pl5 implements lf7 {
    public final byte[] a;
    public final String b;
    public final String c;

    public pl5(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override
    public final go4 a() {
        return null;
    }

    @Override
    public final void b(ht6 ht6Var) {
        String str = this.b;
        if (str != null) {
            ht6Var.a = str;
        }
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pl5.class == obj.getClass()) {
            return Arrays.equals(this.a, ((pl5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return hg9.k(mlb.m("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""), this.a.length, "\"");
    }
}
