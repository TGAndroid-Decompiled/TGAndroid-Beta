package b2;

import j$.util.Objects;
public final class w {
    public static final String f3335c;
    public static final String d;
    public final String f3336a;
    public final String f3337b;

    static {
        String str = e2.d0.f7883a;
        f3335c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public w(String str, String str2) {
        this.f3336a = e2.d0.R(str);
        this.f3337b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (Objects.equals(this.f3336a, wVar.f3336a) && Objects.equals(this.f3337b, wVar.f3337b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3337b.hashCode() * 31;
        String str = this.f3336a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
