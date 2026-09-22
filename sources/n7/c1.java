package n7;

import java.util.Arrays;
public final class c1 extends e1 {
    public final String f15113a;

    public c1(String str) {
        this.f15113a = str;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int zza = e1Var.zza();
        int c10 = e1.c((byte) 96);
        if (c10 != zza) {
            return c10 - e1Var.zza();
        }
        String str = ((c1) e1Var).f15113a;
        int length = str.length();
        String str2 = this.f15113a;
        if (str2.length() != length) {
            return str2.length() - str.length();
        }
        return str2.compareTo(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        return this.f15113a.equals(((c1) obj).f15113a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(e1.c((byte) 96)), this.f15113a});
    }

    public final String toString() {
        return a4.a.t(new StringBuilder("\""), this.f15113a, "\"");
    }

    @Override
    public final int zza() {
        return e1.c((byte) 96);
    }
}
