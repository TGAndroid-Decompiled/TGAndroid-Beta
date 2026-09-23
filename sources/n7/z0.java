package n7;

import java.util.Arrays;
public final class z0 extends e1 {
    public final long f15159a;

    public z0(long j3) {
        this.f15159a = j3;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        if (zza() != e1Var.zza()) {
            return zza() - e1Var.zza();
        }
        int i10 = (Math.abs(this.f15159a) > Math.abs(((z0) e1Var).f15159a) ? 1 : (Math.abs(this.f15159a) == Math.abs(((z0) e1Var).f15159a) ? 0 : -1));
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
        if (obj != null && z0.class == obj.getClass() && this.f15159a == ((z0) obj).f15159a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f15159a)});
    }

    public final String toString() {
        return Long.toString(this.f15159a);
    }

    @Override
    public final int zza() {
        byte b10;
        if (this.f15159a >= 0) {
            b10 = 0;
        } else {
            b10 = 32;
        }
        return e1.c(b10);
    }
}
