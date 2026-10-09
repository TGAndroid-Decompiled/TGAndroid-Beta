package n7;

import java.util.Arrays;
public final class a1 extends c1 {
    public final String f16739a;

    public a1(String str) {
        this.f16739a = str;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c10 = c1.c((byte) 96);
        if (c10 != zza) {
            return c10 - c1Var.zza();
        }
        String str = ((a1) c1Var).f16739a;
        int length = str.length();
        String str2 = this.f16739a;
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
        return this.f16739a.equals(((a1) obj).f16739a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) 96)), this.f16739a});
    }

    public final String toString() {
        return a1.g.t(new StringBuilder("\""), this.f16739a, "\"");
    }

    @Override
    public final int zza() {
        return c1.c((byte) 96);
    }
}
