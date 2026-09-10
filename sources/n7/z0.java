package n7;

import java.util.Arrays;
public final class z0 extends e1 {
    public final long f14014a;

    public z0(long j3) {
        this.f14014a = j3;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        if (zza() != e1Var.zza()) {
            return zza() - e1Var.zza();
        }
        int i10 = (Math.abs(this.f14014a) > Math.abs(((z0) e1Var).f14014a) ? 1 : (Math.abs(this.f14014a) == Math.abs(((z0) e1Var).f14014a) ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 > 0) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass() && this.f14014a == ((z0) obj).f14014a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f14014a)});
    }

    public final String toString() {
        return Long.toString(this.f14014a);
    }

    @Override
    public final int zza() {
        byte b10;
        if (this.f14014a >= 0) {
            b10 = 0;
        } else {
            b10 = 32;
        }
        return e1.c(b10);
    }
}
