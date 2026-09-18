package b2;

import j$.util.Objects;
public final class w {
    public static final String f3340c;
    public static final String d;
    public final String f3341a;
    public final String f3342b;

    static {
        String str = e2.d0.f7887a;
        f3340c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public w(String str, String str2) {
        this.f3341a = e2.d0.R(str);
        this.f3342b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (Objects.equals(this.f3341a, wVar.f3341a) && Objects.equals(this.f3342b, wVar.f3342b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3342b.hashCode() * 31;
        String str = this.f3341a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
