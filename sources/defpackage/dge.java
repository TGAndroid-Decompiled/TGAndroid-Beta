package defpackage;

import java.util.Arrays;
public final class dge extends the {
    public final boolean a;

    public dge(boolean z) {
        this.a = z;
    }

    @Override
    public final int compareTo(Object obj) {
        int i;
        the theVar = (the) obj;
        int zza = theVar.zza();
        int c = the.c((byte) -32);
        if (c != zza) {
            return c - theVar.zza();
        }
        dge dgeVar = (dge) theVar;
        int i2 = 21;
        if (true != this.a) {
            i = 20;
        } else {
            i = 21;
        }
        if (true != dgeVar.a) {
            i2 = 20;
        }
        return i - i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dge.class == obj.getClass() && this.a == ((dge) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(the.c((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override
    public final int zza() {
        return the.c((byte) -32);
    }
}
