package n7;

import java.util.Arrays;
public final class z0 extends d1 {
    public final long f17326a;

    public z0(long j10) {
        this.f17326a = j10;
    }

    @Override
    public final int compareTo(Object obj) {
        d1 d1Var = (d1) obj;
        if (zza() != d1Var.zza()) {
            return zza() - d1Var.zza();
        }
        int i10 = (Math.abs(this.f17326a) > Math.abs(((z0) d1Var).f17326a) ? 1 : (Math.abs(this.f17326a) == Math.abs(((z0) d1Var).f17326a) ? 0 : -1));
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
        if (obj != null && z0.class == obj.getClass() && this.f17326a == ((z0) obj).f17326a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f17326a)});
    }

    public final String toString() {
        return Long.toString(this.f17326a);
    }

    @Override
    public final int zza() {
        byte b10;
        if (this.f17326a >= 0) {
            b10 = 0;
        } else {
            b10 = 32;
        }
        return d1.c(b10);
    }
}
