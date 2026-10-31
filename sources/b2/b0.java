package b2;

import j$.util.Objects;
public final class b0 {
    public static final String f1979c;
    public static final String d;
    public final String f1980a;
    public final String f1981b;

    static {
        String str = e2.l0.f6165a;
        f1979c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public b0(String str, String str2) {
        this.f1980a = e2.l0.T(str);
        this.f1981b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (Objects.equals(this.f1980a, b0Var.f1980a) && Objects.equals(this.f1981b, b0Var.f1981b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f1981b.hashCode() * 31;
        String str = this.f1980a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
