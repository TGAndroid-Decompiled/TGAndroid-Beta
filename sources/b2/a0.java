package b2;

import j$.util.Objects;
public final class a0 {
    public static final String f3693c;
    public static final String d;
    public final String f3694a;
    public final String f3695b;

    static {
        String str = e2.m0.f8259a;
        f3693c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public a0(String str, String str2) {
        this.f3694a = e2.m0.T(str);
        this.f3695b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (Objects.equals(this.f3694a, a0Var.f3694a) && Objects.equals(this.f3695b, a0Var.f3695b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3695b.hashCode() * 31;
        String str = this.f3694a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
