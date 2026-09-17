package b2;

import j$.util.Objects;
public final class w {
    public static final String f2431c;
    public static final String d;
    public final String f2432a;
    public final String f2433b;

    static {
        String str = e2.d0.f8765a;
        f2431c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public w(String str, String str2) {
        this.f2432a = e2.d0.R(str);
        this.f2433b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (Objects.equals(this.f2432a, wVar.f2432a) && Objects.equals(this.f2433b, wVar.f2433b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f2433b.hashCode() * 31;
        String str = this.f2432a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
