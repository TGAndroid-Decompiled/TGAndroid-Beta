package n7;

import java.util.Arrays;
public final class b1 extends d1 {
    public final String f16622a;

    public b1(String str) {
        this.f16622a = str;
    }

    @Override
    public final int compareTo(Object obj) {
        d1 d1Var = (d1) obj;
        int zza = d1Var.zza();
        int c10 = d1.c((byte) 96);
        if (c10 != zza) {
            return c10 - d1Var.zza();
        }
        String str = ((b1) d1Var).f16622a;
        int length = str.length();
        String str2 = this.f16622a;
        if (str2.length() != length) {
            return str2.length() - str.length();
        }
        return str2.compareTo(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        return this.f16622a.equals(((b1) obj).f16622a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c((byte) 96)), this.f16622a});
    }

    public final String toString() {
        return a4.a.s(new StringBuilder("\""), this.f16622a, "\"");
    }

    @Override
    public final int zza() {
        return d1.c((byte) 96);
    }
}
