package defpackage;
public final class a90 extends ty2 {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public a90(String str, int i, String str2, long j, long j2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ty2) {
            a90 a90Var = (a90) ((ty2) obj);
            if (this.a == a90Var.a && this.b.equals(a90Var.b)) {
                String str = a90Var.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == a90Var.d && this.e == a90Var.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.a;
        int hashCode2 = (((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j2 = this.d;
        return ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return de9.l(sb, this.e, "}");
    }
}
