package b2;

import j$.util.Objects;
public final class w {
    public static final String f3675c;
    public static final String d;
    public final String f3676a;
    public final String f3677b;

    static {
        String str = e2.d0.f8529a;
        f3675c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public w(String str, String str2) {
        this.f3676a = e2.d0.Q(str);
        this.f3677b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (Objects.equals(this.f3676a, wVar.f3676a) && Objects.equals(this.f3677b, wVar.f3677b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3677b.hashCode() * 31;
        String str = this.f3676a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
