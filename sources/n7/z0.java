package n7;

import java.util.Arrays;
public final class z0 extends d1 {
    public final long f17329a;

    public z0(long j10) {
        this.f17329a = j10;
    }

    @Override
    public final int compareTo(Object obj) {
        d1 d1Var = (d1) obj;
        if (zza() != d1Var.zza()) {
            return zza() - d1Var.zza();
        }
        int i10 = (Math.abs(this.f17329a) > Math.abs(((z0) d1Var).f17329a) ? 1 : (Math.abs(this.f17329a) == Math.abs(((z0) d1Var).f17329a) ? 0 : -1));
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
        if (obj != null && z0.class == obj.getClass() && this.f17329a == ((z0) obj).f17329a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f17329a)});
    }

    public final String toString() {
        return Long.toString(this.f17329a);
    }

    @Override
    public final int zza() {
        byte b10;
        if (this.f17329a >= 0) {
            b10 = 0;
        } else {
            b10 = 32;
        }
        return d1.c(b10);
    }
}
