package b2;

import j$.util.Objects;
public final class b0 {
    public static final String f2076c;
    public static final String d;
    public final String f2077a;
    public final String f2078b;

    static {
        String str = e2.m0.f8372a;
        f2076c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public b0(String str, String str2) {
        this.f2077a = e2.m0.T(str);
        this.f2078b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (Objects.equals(this.f2077a, b0Var.f2077a) && Objects.equals(this.f2078b, b0Var.f2078b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2078b.hashCode() * 31;
        String str = this.f2077a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
