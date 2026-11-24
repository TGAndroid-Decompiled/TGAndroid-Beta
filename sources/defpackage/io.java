package defpackage;

import j$.util.Objects;
import java.util.Arrays;
public final class io extends uj5 {
    public final String b;
    public final String c;
    public final short d;
    public final byte[] e;

    public io(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override
    public final void b(hr6 hr6Var) {
        hr6Var.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && io.class == obj.getClass()) {
                io ioVar = (io) obj;
                if (this.d == ioVar.d && this.b.equals(ioVar.b) && Objects.equals(this.c, ioVar.c) && Arrays.equals(this.e, ioVar.e)) {
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
        int j = ir2.j((527 + this.d) * 31, 31, this.b);
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
