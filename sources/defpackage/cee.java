package defpackage;

import java.util.Arrays;
public final class cee extends sfe {
    public final boolean a;

    public cee(boolean z) {
        this.a = z;
    }

    @Override
    public final int compareTo(Object obj) {
        int i;
        sfe sfeVar = (sfe) obj;
        int zza = sfeVar.zza();
        int c = sfe.c((byte) -32);
        if (c != zza) {
            return c - sfeVar.zza();
        }
        cee ceeVar = (cee) sfeVar;
        int i2 = 21;
        if (true != this.a) {
            i = 20;
        } else {
            i = 21;
        }
        if (true != ceeVar.a) {
            i2 = 20;
        }
        return i - i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cee.class == obj.getClass() && this.a == ((cee) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(sfe.c((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override
    public final int zza() {
        return sfe.c((byte) -32);
    }
}
