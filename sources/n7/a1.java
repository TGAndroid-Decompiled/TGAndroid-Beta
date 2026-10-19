package n7;

import java.util.Arrays;
public final class a1 extends c1 {
    public final String f17257a;

    public a1(String str) {
        this.f17257a = str;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c10 = c1.c((byte) 96);
        if (c10 != zza) {
            return c10 - c1Var.zza();
        }
        String str = ((a1) c1Var).f17257a;
        int length = str.length();
        String str2 = this.f17257a;
        if (str2.length() != length) {
            return str2.length() - str.length();
        }
        return str2.compareTo(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a1.class != obj.getClass()) {
            return false;
        }
        return this.f17257a.equals(((a1) obj).f17257a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) 96)), this.f17257a});
    }

    public final String toString() {
        return a1.g.s(new StringBuilder("\""), this.f17257a, "\"");
    }

    @Override
    public final int zza() {
        return c1.c((byte) 96);
    }
}
