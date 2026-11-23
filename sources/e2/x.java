package e2;

import j$.util.Objects;
public final class x {
    public static final String f10787c;
    public static final String d;
    public final String f10788a;
    public final String f10789b;

    static {
        String str = h2.l0.f13778a;
        f10787c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public x(String str, String str2) {
        this.f10788a = h2.l0.T(str);
        this.f10789b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (Objects.equals(this.f10788a, xVar.f10788a) && Objects.equals(this.f10789b, xVar.f10789b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10789b.hashCode() * 31;
        String str = this.f10788a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }
}
