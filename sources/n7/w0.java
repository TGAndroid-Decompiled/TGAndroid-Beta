package n7;

import java.util.Arrays;
public final class w0 extends d1 {
    public final boolean f17326a;

    public w0(boolean z10) {
        this.f17326a = z10;
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
        if (true != this.f17326a) {
            i10 = 20;
        } else {
            i10 = 21;
        }
        if (true != w0Var.f17326a) {
            i11 = 20;
        }
        return i10 - i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass() && this.f17326a == ((w0) obj).f17326a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c((byte) -32)), Boolean.valueOf(this.f17326a)});
    }

    public final String toString() {
        return Boolean.toString(this.f17326a);
    }

    @Override
    public final int zza() {
        return d1.c((byte) -32);
    }
}
