package defpackage;

import java.util.Arrays;
public final class lje extends jke {
    public final long a;

    public lje(long j) {
        this.a = j;
    }

    @Override
    public final int compareTo(Object obj) {
        jke jkeVar = (jke) obj;
        if (zza() != jkeVar.zza()) {
            return zza() - jkeVar.zza();
        }
        int i = (Math.abs(this.a) > Math.abs(((lje) jkeVar).a) ? 1 : (Math.abs(this.a) == Math.abs(((lje) jkeVar).a) ? 0 : -1));
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
        if (obj != null && lje.class == obj.getClass() && this.a == ((lje) obj).a) {
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
        return jke.c(b);
    }
}
