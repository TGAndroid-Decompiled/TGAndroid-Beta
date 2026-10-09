package b2;

import j$.util.Objects;
public final class w {
    public static final String f3677c;
    public static final String d;
    public final String f3678a;
    public final String f3679b;

    static {
        String str = e2.d0.f8532a;
        f3677c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public w(String str, String str2) {
        this.f3678a = e2.d0.Q(str);
        this.f3679b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (Objects.equals(this.f3678a, wVar.f3678a) && Objects.equals(this.f3679b, wVar.f3679b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3679b.hashCode() * 31;
        String str = this.f3678a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
