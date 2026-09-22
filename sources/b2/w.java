package b2;

import j$.util.Objects;
public final class w {
    public static final String f3337c;
    public static final String d;
    public final String f3338a;
    public final String f3339b;

    static {
        String str = e2.d0.f7885a;
        f3337c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public w(String str, String str2) {
        this.f3338a = e2.d0.R(str);
        this.f3339b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (Objects.equals(this.f3338a, wVar.f3338a) && Objects.equals(this.f3339b, wVar.f3339b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3339b.hashCode() * 31;
        String str = this.f3338a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
