package b2;

import j$.util.Objects;
public final class w {
    public static final String f3334c;
    public static final String d;
    public final String f3335a;
    public final String f3336b;

    static {
        String str = e2.d0.f7872a;
        f3334c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public w(String str, String str2) {
        this.f3335a = e2.d0.R(str);
        this.f3336b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (Objects.equals(this.f3335a, wVar.f3335a) && Objects.equals(this.f3336b, wVar.f3336b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3336b.hashCode() * 31;
        String str = this.f3335a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
