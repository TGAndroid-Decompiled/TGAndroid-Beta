package defpackage;

import j$.util.Objects;
import java.util.Arrays;
public final class ip extends tl5 {
    public final String b;
    public final String c;
    public final short d;
    public final byte[] e;

    public ip(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override
    public final void b(ht6 ht6Var) {
        ht6Var.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ip.class == obj.getClass()) {
                ip ipVar = (ip) obj;
                if (this.d == ipVar.d && this.b.equals(ipVar.b) && Objects.equals(this.c, ipVar.c) && Arrays.equals(this.e, ipVar.e)) {
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
        int j = ts2.j((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.e) + ((j + i) * 31);
    }

    @Override
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
