package b7;

import java.util.Arrays;
public final class f1 extends h1 {
    public final String f1690a;

    public f1(String str) {
        this.f1690a = str;
    }

    @Override
    public final int compareTo(Object obj) {
        h1 h1Var = (h1) obj;
        int zza = h1Var.zza();
        int c3 = h1.c((byte) 96);
        if (c3 != zza) {
            return c3 - h1Var.zza();
        }
        String str = ((f1) h1Var).f1690a;
        int length = str.length();
        String str2 = this.f1690a;
        if (str2.length() != length) {
            return str2.length() - str.length();
        }
        return str2.compareTo(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f1.class != obj.getClass()) {
            return false;
        }
        return this.f1690a.equals(((f1) obj).f1690a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(h1.c((byte) 96)), this.f1690a});
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("\""), this.f1690a, "\"");
    }

    @Override
    public final int zza() {
        return h1.c((byte) 96);
    }
}
