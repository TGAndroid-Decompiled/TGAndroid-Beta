package defpackage;

import java.util.Arrays;
public final class tie extends jke {
    public final boolean a;

    public tie(boolean z) {
        this.a = z;
    }

    @Override
    public final int compareTo(Object obj) {
        int i;
        jke jkeVar = (jke) obj;
        int zza = jkeVar.zza();
        int c = jke.c((byte) -32);
        if (c != zza) {
            return c - jkeVar.zza();
        }
        tie tieVar = (tie) jkeVar;
        int i2 = 21;
        if (true != this.a) {
            i = 20;
        } else {
            i = 21;
        }
        if (true != tieVar.a) {
            i2 = 20;
        }
        return i - i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tie.class == obj.getClass() && this.a == ((tie) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(jke.c((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override
    public final int zza() {
        return jke.c((byte) -32);
    }
}
