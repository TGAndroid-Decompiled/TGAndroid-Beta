package m2;

import j$.util.Objects;
public final class f {
    public final String f14638a;
    public final String f14639b;
    public final String f14640c;

    public f(String str, String str2, String str3) {
        this.f14638a = str;
        this.f14639b = str2;
        this.f14640c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f14638a, fVar.f14638a) && Objects.equals(this.f14639b, fVar.f14639b) && Objects.equals(this.f14640c, fVar.f14640c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f14638a.hashCode() * 31;
        int i11 = 0;
        String str = this.f14639b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f14640c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
