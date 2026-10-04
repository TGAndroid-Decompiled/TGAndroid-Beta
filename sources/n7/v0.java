package n7;

import java.util.Arrays;
public final class v0 extends d1 {
    public final boolean f16834a;

    public v0(boolean z10) {
        this.f16834a = z10;
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
        v0 v0Var = (v0) d1Var;
        int i11 = 21;
        if (true != this.f16834a) {
            i10 = 20;
        } else {
            i10 = 21;
        }
        if (true != v0Var.f16834a) {
            i11 = 20;
        }
        return i10 - i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass() && this.f16834a == ((v0) obj).f16834a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c((byte) -32)), Boolean.valueOf(this.f16834a)});
    }

    public final String toString() {
        return Boolean.toString(this.f16834a);
    }

    @Override
    public final int zza() {
        return d1.c((byte) -32);
    }
}
