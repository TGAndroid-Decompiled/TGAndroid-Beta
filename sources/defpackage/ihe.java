package defpackage;

import java.util.Arrays;
public final class ihe extends the {
    public final String a;

    public ihe(String str) {
        this.a = str;
    }

    @Override
    public final int compareTo(Object obj) {
        the theVar = (the) obj;
        int zza = theVar.zza();
        int c = the.c((byte) 96);
        if (c != zza) {
            return c - theVar.zza();
        }
        String str = ((ihe) theVar).a;
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
        if (obj == null || ihe.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ihe) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(the.c((byte) 96)), this.a});
    }

    public final String toString() {
        return b10.j(new StringBuilder("\""), this.a, "\"");
    }

    @Override
    public final int zza() {
        return the.c((byte) 96);
    }
}
