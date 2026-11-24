package defpackage;

import j$.util.Objects;
import java.util.Arrays;
public final class lu4 extends tl5 {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public lu4(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && lu4.class == obj.getClass()) {
                lu4 lu4Var = (lu4) obj;
                if (Objects.equals(this.b, lu4Var.b) && this.c.equals(lu4Var.c) && this.d.equals(lu4Var.d) && Arrays.equals(this.e, lu4Var.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.e) + ts2.j(ts2.j((527 + i) * 31, 31, this.c), 31, this.d);
    }

    @Override
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
