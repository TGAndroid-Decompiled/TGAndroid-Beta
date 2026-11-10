package da;

import java.util.List;
public final class y0 extends e2 {
    public final String f8568a;
    public final String f8569b;
    public final List f8570c;
    public final e2 d;
    public final int f8571e;

    public y0(String str, String str2, List list, e2 e2Var, int i7) {
        this.f8568a = str;
        this.f8569b = str2;
        this.f8570c = list;
        this.d = e2Var;
        this.f8571e = i7;
    }

    public final boolean equals(Object obj) {
        String str;
        e2 e2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            y0 y0Var = (y0) ((e2) obj);
            e2 e2Var2 = y0Var.d;
            String str2 = y0Var.f8569b;
            if (this.f8568a.equals(y0Var.f8568a) && ((str = this.f8569b) != null ? str.equals(str2) : str2 == null) && this.f8570c.equals(y0Var.f8570c) && ((e2Var = this.d) != null ? e2Var.equals(e2Var2) : e2Var2 == null) && this.f8571e == y0Var.f8571e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f8568a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        String str = this.f8569b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f8570c.hashCode()) * 1000003;
        e2 e2Var = this.d;
        if (e2Var != null) {
            i7 = e2Var.hashCode();
        }
        return ((hashCode3 ^ i7) * 1000003) ^ this.f8571e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f8568a);
        sb2.append(", reason=");
        sb2.append(this.f8569b);
        sb2.append(", frames=");
        sb2.append(this.f8570c);
        sb2.append(", causedBy=");
        sb2.append(this.d);
        sb2.append(", overflowCount=");
        return a8.p0.n(this.f8571e, "}", sb2);
    }
}
