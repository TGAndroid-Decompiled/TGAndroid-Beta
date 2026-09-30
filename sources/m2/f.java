package m2;

import j$.util.Objects;
public final class f {
    public final String f14669a;
    public final String f14670b;
    public final String f14671c;

    public f(String str, String str2, String str3) {
        this.f14669a = str;
        this.f14670b = str2;
        this.f14671c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f14669a, fVar.f14669a) && Objects.equals(this.f14670b, fVar.f14670b) && Objects.equals(this.f14671c, fVar.f14671c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f14669a.hashCode() * 31;
        int i11 = 0;
        String str = this.f14670b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f14671c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
