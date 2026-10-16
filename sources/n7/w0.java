package n7;

import java.util.Arrays;
public final class w0 extends d1 {
    public final boolean f15943a;

    public w0(boolean z10) {
        this.f15943a = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        int i10;
        d1 d1Var = (d1) obj;
        int zza = d1Var.zza();
        int c10 = d1.c((byte) -32);
        if (c10 != zza) {
            return c10 - d1Var.zza();
        }
        w0 w0Var = (w0) d1Var;
        int i11 = 21;
        if (true != this.f15943a) {
            i10 = 20;
        } else {
            i10 = 21;
        }
        if (true != w0Var.f15943a) {
            i11 = 20;
        }
        return i10 - i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass() && this.f15943a == ((w0) obj).f15943a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c((byte) -32)), Boolean.valueOf(this.f15943a)});
    }

    public final String toString() {
        return Boolean.toString(this.f15943a);
    }

    @Override
    public final int zza() {
        return d1.c((byte) -32);
    }
}
