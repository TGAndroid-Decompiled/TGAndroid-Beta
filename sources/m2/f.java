package m2;

import j$.util.Objects;
public final class f {
    public final String f14648a;
    public final String f14649b;
    public final String f14650c;

    public f(String str, String str2, String str3) {
        this.f14648a = str;
        this.f14649b = str2;
        this.f14650c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f14648a, fVar.f14648a) && Objects.equals(this.f14649b, fVar.f14649b) && Objects.equals(this.f14650c, fVar.f14650c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f14648a.hashCode() * 31;
        int i11 = 0;
        String str = this.f14649b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f14650c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
