package ca;

import java.util.List;
public final class y0 extends e2 {
    public final String f4591a;
    public final String f4592b;
    public final List f4593c;
    public final e2 d;
    public final int f4594e;

    public y0(String str, String str2, List list, e2 e2Var, int i3) {
        this.f4591a = str;
        this.f4592b = str2;
        this.f4593c = list;
        this.d = e2Var;
        this.f4594e = i3;
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
            String str2 = y0Var.f4592b;
            if (this.f4591a.equals(y0Var.f4591a) && ((str = this.f4592b) != null ? str.equals(str2) : str2 == null) && this.f4593c.equals(y0Var.f4593c) && ((e2Var = this.d) != null ? e2Var.equals(e2Var2) : e2Var2 == null) && this.f4594e == y0Var.f4594e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f4591a.hashCode() ^ 1000003) * 1000003;
        int i3 = 0;
        String str = this.f4592b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f4593c.hashCode()) * 1000003;
        e2 e2Var = this.d;
        if (e2Var != null) {
            i3 = e2Var.hashCode();
        }
        return ((hashCode3 ^ i3) * 1000003) ^ this.f4594e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f4591a);
        sb2.append(", reason=");
        sb2.append(this.f4592b);
        sb2.append(", frames=");
        sb2.append(this.f4593c);
        sb2.append(", causedBy=");
        sb2.append(this.d);
        sb2.append(", overflowCount=");
        return a1.g.o(this.f4594e, "}", sb2);
    }
}
