package defpackage;

import java.util.Arrays;
public final class uee extends sfe {
    public final long a;

    public uee(long j) {
        this.a = j;
    }

    @Override
    public final int compareTo(Object obj) {
        sfe sfeVar = (sfe) obj;
        if (zza() != sfeVar.zza()) {
            return zza() - sfeVar.zza();
        }
        int i = (Math.abs(this.a) > Math.abs(((uee) sfeVar).a) ? 1 : (Math.abs(this.a) == Math.abs(((uee) sfeVar).a) ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uee.class == obj.getClass() && this.a == ((uee) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    @Override
    public final int zza() {
        byte b;
        if (this.a >= 0) {
            b = 0;
        } else {
            b = 32;
        }
        return sfe.c(b);
    }
}
