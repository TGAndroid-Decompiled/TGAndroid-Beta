package n7;

import java.util.Arrays;
public final class y0 extends c1 {
    public final long f17329a;

    public y0(long j10) {
        this.f17329a = j10;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        if (zza() != c1Var.zza()) {
            return zza() - c1Var.zza();
        }
        int i10 = (Math.abs(this.f17329a) > Math.abs(((y0) c1Var).f17329a) ? 1 : (Math.abs(this.f17329a) == Math.abs(((y0) c1Var).f17329a) ? 0 : -1));
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
        if (obj != null && y0.class == obj.getClass() && this.f17329a == ((y0) obj).f17329a) {
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
        return c1.c(b10);
    }
}
