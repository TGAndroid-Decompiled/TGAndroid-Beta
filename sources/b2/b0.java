package b2;

import j$.util.Objects;
public final class b0 {
    public static final String f3143c;
    public static final String d;
    public final String f3144a;
    public final String f3145b;

    static {
        String str = e2.n0.f9692a;
        f3143c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public b0(String str, String str2) {
        this.f3144a = e2.n0.T(str);
        this.f3145b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (Objects.equals(this.f3144a, b0Var.f3144a) && Objects.equals(this.f3145b, b0Var.f3145b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3145b.hashCode() * 31;
        String str = this.f3144a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
