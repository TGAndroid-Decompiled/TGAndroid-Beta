package defpackage;

import java.util.Arrays;
public final class vge extends the {
    public final long a;

    public vge(long j) {
        this.a = j;
    }

    @Override
    public final int compareTo(Object obj) {
        the theVar = (the) obj;
        if (zza() != theVar.zza()) {
            return zza() - theVar.zza();
        }
        int i = (Math.abs(this.a) > Math.abs(((vge) theVar).a) ? 1 : (Math.abs(this.a) == Math.abs(((vge) theVar).a) ? 0 : -1));
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
        if (obj != null && vge.class == obj.getClass() && this.a == ((vge) obj).a) {
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
        return the.c(b);
    }
}
