package m2;

import j$.util.Objects;
public final class f {
    public final String f14653a;
    public final String f14654b;
    public final String f14655c;

    public f(String str, String str2, String str3) {
        this.f14653a = str;
        this.f14654b = str2;
        this.f14655c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f14653a, fVar.f14653a) && Objects.equals(this.f14654b, fVar.f14654b) && Objects.equals(this.f14655c, fVar.f14655c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f14653a.hashCode() * 31;
        int i11 = 0;
        String str = this.f14654b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f14655c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
