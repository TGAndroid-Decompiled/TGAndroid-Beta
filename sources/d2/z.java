package d2;

import j$.util.Objects;
public final class z {
    public static final String f8521c;
    public static final String d;
    public final String f8522a;
    public final String f8523b;

    static {
        String str = g2.n0.f11873a;
        f8521c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public z(String str, String str2) {
        this.f8522a = g2.n0.T(str);
        this.f8523b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (Objects.equals(this.f8522a, zVar.f8522a) && Objects.equals(this.f8523b, zVar.f8523b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int hashCode = this.f8523b.hashCode() * 31;
        String str = this.f8522a;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        return hashCode + i3;
    }
}
