package e2;

import j$.util.Objects;
public final class x {
    public static final String f10646c;
    public static final String d;
    public final String f10647a;
    public final String f10648b;

    static {
        String str = h2.m0.f14114a;
        f10646c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public x(String str, String str2) {
        this.f10647a = h2.m0.T(str);
        this.f10648b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (Objects.equals(this.f10647a, xVar.f10647a) && Objects.equals(this.f10648b, xVar.f10648b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10648b.hashCode() * 31;
        String str = this.f10647a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }
}
