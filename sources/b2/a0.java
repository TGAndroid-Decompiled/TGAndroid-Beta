package b2;

import j$.util.Objects;
public final class a0 {
    public static final String f3688c;
    public static final String d;
    public final String f3689a;
    public final String f3690b;

    static {
        String str = e2.m0.f8254a;
        f3688c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public a0(String str, String str2) {
        this.f3689a = e2.m0.T(str);
        this.f3690b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (Objects.equals(this.f3689a, a0Var.f3689a) && Objects.equals(this.f3690b, a0Var.f3690b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3690b.hashCode() * 31;
        String str = this.f3689a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
