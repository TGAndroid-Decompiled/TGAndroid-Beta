package e2;

import j$.util.Objects;
public final class x {
    public static final String f10821c;
    public static final String d;
    public final String f10822a;
    public final String f10823b;

    static {
        String str = h2.l0.f13812a;
        f10821c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public x(String str, String str2) {
        this.f10822a = h2.l0.T(str);
        this.f10823b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (Objects.equals(this.f10822a, xVar.f10822a) && Objects.equals(this.f10823b, xVar.f10823b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10823b.hashCode() * 31;
        String str = this.f10822a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }
}
