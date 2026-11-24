package defpackage;

import java.util.Arrays;
public final class fg7 extends tl5 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public fg7(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && fg7.class == obj.getClass()) {
                fg7 fg7Var = (fg7) obj;
                if (this.b == fg7Var.b && this.c == fg7Var.c && this.d == fg7Var.d && Arrays.equals(this.e, fg7Var.e) && Arrays.equals(this.f, fg7Var.f)) {
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
