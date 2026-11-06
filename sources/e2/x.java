package e2;

import j$.util.Objects;
public final class x {
    public static final String f10641c;
    public static final String d;
    public final String f10642a;
    public final String f10643b;

    static {
        String str = h2.m0.f14112a;
        f10641c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public x(String str, String str2) {
        this.f10642a = h2.m0.T(str);
        this.f10643b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (Objects.equals(this.f10642a, xVar.f10642a) && Objects.equals(this.f10643b, xVar.f10643b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10643b.hashCode() * 31;
        String str = this.f10642a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }
}
