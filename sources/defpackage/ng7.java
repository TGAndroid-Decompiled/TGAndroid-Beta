package defpackage;

import java.util.Arrays;
public final class ng7 extends wl5 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public ng7(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ng7.class == obj.getClass()) {
                ng7 ng7Var = (ng7) obj;
                if (this.b == ng7Var.b && this.c == ng7Var.c && this.d == ng7Var.d && Arrays.equals(this.e, ng7Var.e) && Arrays.equals(this.f, ng7Var.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f) + ((hashCode + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
