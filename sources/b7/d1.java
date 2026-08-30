package b7;

import java.util.Arrays;
public final class d1 extends h1 {
    public final long f1676a;

    public d1(long j10) {
        this.f1676a = j10;
    }

    @Override
    public final int compareTo(Object obj) {
        h1 h1Var = (h1) obj;
        if (zza() != h1Var.zza()) {
            return zza() - h1Var.zza();
        }
        int i10 = (Math.abs(this.f1676a) > Math.abs(((d1) h1Var).f1676a) ? 1 : (Math.abs(this.f1676a) == Math.abs(((d1) h1Var).f1676a) ? 0 : -1));
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
        if (obj != null && d1.class == obj.getClass() && this.f1676a == ((d1) obj).f1676a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f1676a)});
    }

    public final String toString() {
        return Long.toString(this.f1676a);
    }

    @Override
    public final int zza() {
        byte b10;
        if (this.f1676a >= 0) {
            b10 = 0;
        } else {
            b10 = 32;
        }
        return h1.c(b10);
    }
}
