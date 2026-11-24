package defpackage;

import java.util.Arrays;
public final class hfe extends sfe {
    public final String a;

    public hfe(String str) {
        this.a = str;
    }

    @Override
    public final int compareTo(Object obj) {
        sfe sfeVar = (sfe) obj;
        int zza = sfeVar.zza();
        int c = sfe.c((byte) 96);
        if (c != zza) {
            return c - sfeVar.zza();
        }
        String str = ((hfe) sfeVar).a;
        int length = str.length();
        String str2 = this.a;
        if (str2.length() != length) {
            return str2.length() - str.length();
        }
        return str2.compareTo(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hfe.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((hfe) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(sfe.c((byte) 96)), this.a});
    }

    public final String toString() {
        return b00.j(new StringBuilder("\""), this.a, "\"");
    }

    @Override
    public final int zza() {
        return sfe.c((byte) 96);
    }
}
