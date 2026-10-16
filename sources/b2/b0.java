package b2;

import j$.util.Objects;
public final class b0 {
    public static final String f2080c;
    public static final String d;
    public final String f2081a;
    public final String f2082b;

    static {
        String str = e2.m0.f8375a;
        f2080c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public b0(String str, String str2) {
        this.f2081a = e2.m0.T(str);
        this.f2082b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (Objects.equals(this.f2081a, b0Var.f2081a) && Objects.equals(this.f2082b, b0Var.f2082b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2082b.hashCode() * 31;
        String str = this.f2081a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
