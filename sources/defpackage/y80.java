package defpackage;

import java.util.List;
public final class y80 extends mz2 {
    public final String a;
    public final String b;
    public final List c;
    public final mz2 d;
    public final int e;

    public y80(String str, String str2, List list, mz2 mz2Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = mz2Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mz2) {
            y80 y80Var = (y80) ((mz2) obj);
            if (this.a.equals(y80Var.a)) {
                String str = y80Var.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.c.equals(y80Var.c)) {
                        mz2 mz2Var = y80Var.d;
                        mz2 mz2Var2 = this.d;
                        if (mz2Var2 != null ? mz2Var2.equals(mz2Var) : mz2Var == null) {
                            if (this.e == y80Var.e) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003;
        mz2 mz2Var = this.d;
        if (mz2Var != null) {
            i = mz2Var.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return uh9.l(sb, this.e, "}");
    }
}
