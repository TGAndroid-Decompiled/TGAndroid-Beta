package b2;

import j$.util.Objects;
public final class w {
    public static final String f2033c;
    public static final String d;
    public final String f2034a;
    public final String f2035b;

    static {
        String str = e2.d0.f7188a;
        f2033c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public w(String str, String str2) {
        this.f2034a = e2.d0.R(str);
        this.f2035b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (Objects.equals(this.f2034a, wVar.f2034a) && Objects.equals(this.f2035b, wVar.f2035b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2035b.hashCode() * 31;
        String str = this.f2034a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
