package e2;

import j$.util.Objects;
public final class x {
    public static final String f10824c;
    public static final String d;
    public final String f10825a;
    public final String f10826b;

    static {
        String str = h2.l0.f13815a;
        f10824c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public x(String str, String str2) {
        this.f10825a = h2.l0.T(str);
        this.f10826b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (Objects.equals(this.f10825a, xVar.f10825a) && Objects.equals(this.f10826b, xVar.f10826b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10826b.hashCode() * 31;
        String str = this.f10825a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }
}
