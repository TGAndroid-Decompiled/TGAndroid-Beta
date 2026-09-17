package n7;

import java.util.Arrays;
public final class y0 extends d1 {
    public final long f16700a;

    public y0(long j3) {
        this.f16700a = j3;
    }

    @Override
    public final int compareTo(Object obj) {
        d1 d1Var = (d1) obj;
        if (zza() != d1Var.zza()) {
            return zza() - d1Var.zza();
        }
        int i10 = (Math.abs(this.f16700a) > Math.abs(((y0) d1Var).f16700a) ? 1 : (Math.abs(this.f16700a) == Math.abs(((y0) d1Var).f16700a) ? 0 : -1));
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
        if (obj != null && y0.class == obj.getClass() && this.f16700a == ((y0) obj).f16700a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f16700a)});
    }

    public final String toString() {
        return Long.toString(this.f16700a);
    }

    @Override
    public final int zza() {
        byte b10;
        if (this.f16700a >= 0) {
            b10 = 0;
        } else {
            b10 = 32;
        }
        return d1.c(b10);
    }
}
