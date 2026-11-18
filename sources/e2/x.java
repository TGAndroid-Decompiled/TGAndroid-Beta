package e2;

import j$.util.Objects;
public final class x {
    public static final String f10792c;
    public static final String d;
    public final String f10793a;
    public final String f10794b;

    static {
        String str = h2.l0.f13783a;
        f10792c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public x(String str, String str2) {
        this.f10793a = h2.l0.T(str);
        this.f10794b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (Objects.equals(this.f10793a, xVar.f10793a) && Objects.equals(this.f10794b, xVar.f10794b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10794b.hashCode() * 31;
        String str = this.f10793a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }
}
