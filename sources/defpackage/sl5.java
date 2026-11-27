package defpackage;

import java.util.Arrays;
public final class sl5 implements tf7 {
    public final byte[] a;
    public final String b;
    public final String c;

    public sl5(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override
    public final ko4 a() {
        return null;
    }

    @Override
    public final void b(lt6 lt6Var) {
        String str = this.b;
        if (str != null) {
            lt6Var.a = str;
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
        if (obj != null && sl5.class == obj.getClass()) {
            return Arrays.equals(this.a, ((sl5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return uh9.l(xnb.l("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""), this.a.length, "\"");
    }
}
