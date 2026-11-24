package defpackage;

import java.util.Arrays;
public final class qj5 implements jd7 {
    public final byte[] a;
    public final String b;
    public final String c;

    public qj5(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override
    public final fm4 a() {
        return null;
    }

    @Override
    public final void b(hr6 hr6Var) {
        String str = this.b;
        if (str != null) {
            hr6Var.a = str;
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
        if (obj != null && qj5.class == obj.getClass()) {
            return Arrays.equals(this.a, ((qj5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return de9.l(yjb.l("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""), this.a.length, "\"");
    }
}
