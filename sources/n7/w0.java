package n7;

import java.util.Arrays;
public final class w0 extends e1 {
    public final boolean f14007a;

    public w0(boolean z10) {
        this.f14007a = z10;
    }

    @Override
    public final int compareTo(Object obj) {
        int i10;
        e1 e1Var = (e1) obj;
        int zza = e1Var.zza();
        int c10 = e1.c((byte) -32);
        if (c10 != zza) {
            return c10 - e1Var.zza();
        }
        w0 w0Var = (w0) e1Var;
        int i11 = 21;
        if (true != this.f14007a) {
            i10 = 20;
        } else {
            i10 = 21;
        }
        if (true != w0Var.f14007a) {
            i11 = 20;
        }
        return i10 - i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass() && this.f14007a == ((w0) obj).f14007a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(e1.c((byte) -32)), Boolean.valueOf(this.f14007a)});
    }

    public final String toString() {
        return Boolean.toString(this.f14007a);
    }

    @Override
    public final int zza() {
        return e1.c((byte) -32);
    }
}
