package defpackage;

import java.util.Arrays;
public final class w1c {
    public final byte a;
    public final byte[] b;
    public final int c;
    public final int d;

    public w1c(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w1c.class == obj.getClass()) {
                w1c w1cVar = (w1c) obj;
                if (this.a == w1cVar.a && this.c == w1cVar.c && this.d == w1cVar.d && Arrays.equals(this.b, w1cVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
