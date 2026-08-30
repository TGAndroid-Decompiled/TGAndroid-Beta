package b7;

import java.util.Arrays;
public final class a1 extends h1 {
    public final boolean f1663a;

    public a1(boolean z4) {
        this.f1663a = z4;
    }

    @Override
    public final int compareTo(Object obj) {
        int i10;
        h1 h1Var = (h1) obj;
        int zza = h1Var.zza();
        int c3 = h1.c((byte) -32);
        if (c3 != zza) {
            return c3 - h1Var.zza();
        }
        a1 a1Var = (a1) h1Var;
        int i11 = 21;
        if (true != this.f1663a) {
            i10 = 20;
        } else {
            i10 = 21;
        }
        if (true != a1Var.f1663a) {
            i11 = 20;
        }
        return i10 - i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass() && this.f1663a == ((a1) obj).f1663a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(h1.c((byte) -32)), Boolean.valueOf(this.f1663a)});
    }

    public final String toString() {
        return Boolean.toString(this.f1663a);
    }

    @Override
    public final int zza() {
        return h1.c((byte) -32);
    }
}
